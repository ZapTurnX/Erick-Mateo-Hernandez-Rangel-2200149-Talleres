package xyz.erick.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.erick.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
