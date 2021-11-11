package mx.edu.uacm.onetomany.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.edu.uacm.onetomany.OneToManyApplication;
import mx.edu.uacm.onetomany.repository.PersonaRepository;

@SpringBootTest(classes = {OneToManyApplication.class})
public class PersonaTest {
	
	private Logger log = LogManager.getLogger(PersonaTest.class);
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Test
	public void debeGuardarPersonaConTelefonos() {
		log.debug("> Entrando a debeGuardarPersonaConTelefonos <");
		
		Telefono t1 = new Telefono("727272");
		Telefono t2 = new Telefono("837373");
		
		//la asociacion es una persona muchos telefonos
		Persona p = new Persona("Brandon");
		
		//coleccion
		List<Telefono> fones = new ArrayList<>();
		fones.add(t1);
		fones.add(t2);
		
		//asociacion de persona con los telefonos
		p.setTelefonos(fones);
		
		personaRepository.save(p);
		
		
	}

}
