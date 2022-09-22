package xyz.erick.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.erick.persona.model.Ciudad;
import xyz.erick.persona.service.CiudadService;

@RestController
@RequestMapping ("/ciudades/")
public class CiudadREST {
	
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping
	private ResponseEntity<List<Ciudad>> getAllCiudades (){
		return ResponseEntity.ok(ciudadService.findAll());
		
	}
	

}
