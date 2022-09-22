package xyz.erick.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.erick.persona.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long>{

}
