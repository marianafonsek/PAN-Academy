package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@GetMapping("/listar")
	public ResponseEntity<Object> getProduto() {
		return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
	}

	@DeleteMapping("/deletar")
	public ResponseEntity<Object> delete(@PathVariable("id") String id) {
		produtoService.deleteProduto(id);
		return new ResponseEntity<>("Prod Deletado!", HttpStatus.OK);
	}

	@PostMapping("/produtos")
	public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
		produtoService.createProduto(produto);
		return new ResponseEntity<>("Prod criado", HttpStatus.CREATED);		
	}
}


