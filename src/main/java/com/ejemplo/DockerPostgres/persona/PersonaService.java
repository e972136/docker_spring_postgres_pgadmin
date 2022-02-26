package com.ejemplo.DockerPostgres.persona;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonaService {
    private final PersonaRepository repository;

    public void guardar(Persona p){
        repository.save(p);
    }

    public List<Persona> lista(){
        return repository.findAll();
    }
}
