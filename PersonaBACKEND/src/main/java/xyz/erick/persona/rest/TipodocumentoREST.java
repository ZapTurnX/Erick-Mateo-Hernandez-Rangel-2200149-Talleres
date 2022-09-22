package xyz.erick.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.erick.persona.model.Tipodocumento;
import xyz.erick.persona.service.TipodocumentoService;

@RestController
@RequestMapping ("/tipodocumentos/")
public class TipodocumentoREST {
	
	@Autowired
	private TipodocumentoService tipodocumentoService;
	
	@GetMapping
	private ResponseEntity<List<Tipodocumento>> getAllTipodocumentos (){
		return ResponseEntity.ok(tipodocumentoService.findAll());
	}

}
