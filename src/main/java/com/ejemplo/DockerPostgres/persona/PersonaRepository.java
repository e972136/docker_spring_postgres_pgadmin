package com.ejemplo.DockerPostgres.persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,String> {
}
