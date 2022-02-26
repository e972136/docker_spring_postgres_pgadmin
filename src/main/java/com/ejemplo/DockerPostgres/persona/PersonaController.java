package com.ejemplo.DockerPostgres.persona;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="/persona")
@RequiredArgsConstructor
@Slf4j
public class PersonaController {
    private final PersonaService service;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Map<String, Object> solicitud){
        String nombre = (String)solicitud.getOrDefault("nombre","x");
        String apellido = (String)solicitud.getOrDefault("apellido","x");
        Persona x = new Persona(nombre,apellido);
        service.guardar(x);
    }

    @GetMapping("/listar")
    public List<Persona> listar(){
        return service.lista();
    }
}
