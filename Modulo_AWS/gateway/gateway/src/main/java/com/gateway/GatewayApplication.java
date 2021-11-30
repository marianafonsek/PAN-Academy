package com.gateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class GatewayApplication {
	
	private List<Book> books = new ArrayList<>();
	public Book addBook(@RequestBody Book book) {
		books.add(book);
		return book;
	}
	
	@GetMapping
	public List<Book> getBook(){
		return books;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
