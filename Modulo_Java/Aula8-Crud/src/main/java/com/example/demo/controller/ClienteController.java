package com.example.demo.controller;

import java.util.List;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;

@RequestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

@AutoWired
private ClienteRepository clienteRepository;

@GetMapping("/listar")
public List<ClienteModel> findAll() {
	return clienteRepository.findAll();
}

@PostMapping("/salvar")
	ResponseEntity<ClienteModel>post(@RequestBody ClienteModel clientinho) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clientinho));
		
	}

	@GetMapping("/listar/{tipo}")public ResponseEntity<List<ClienteModel>> filtroId(@PathVariable Integer tipo) {
		return ResponseEntity.ok(clienteRepository.procuraTipoPessoas(tipo));
		
	}
}
