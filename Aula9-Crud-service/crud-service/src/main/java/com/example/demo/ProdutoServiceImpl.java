package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		
		//mocka um produto - chocolate
		Produto chocolate = new Produto();
		chocolate.setId("chocolate");
		chocolate.setNome("chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		
		Produto trufa = new Produto ();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
	}
	
//	salva
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
	}
	
	//deleta
	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
	}
	
//	pegar e trazer de volta
	@Override
	public Collection<Produto> getProdutos() {
		return produtoRepository.values();
	}
}
