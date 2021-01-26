package com.ApiTeste.ApiTeste.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class TesteController {
	
	@GetMapping
	public ResponseEntity<String> find() {
		return ResponseEntity.ok().body("Teste concluído com sucesso.");
	}

}
