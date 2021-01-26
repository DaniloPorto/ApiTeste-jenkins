package com.ApiTeste.ApiTeste.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiTeste.ApiTeste.model.Cliente;
import com.ApiTeste.ApiTeste.model.Testes;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Testes testes){
		Cliente c = new Cliente(testes.getListCliente().stream().findFirst().get().getNome());
		
		return ResponseEntity.ok().body(c);
	}
}
