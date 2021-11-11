package mx.edu.uacm.onetomany.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.onetomany.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long>{

}
