package com.tarefaExtraJson;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class UltimoWhile {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(UltimoWhile.class, args);
				JSONObject jsonzinho = new JSONObject();

				jsonzinho.put("Nome", "Mariana");
				jsonzinho.put("Sobrenome", "Fonseca");
				jsonzinho.put("idade", 26);
				jsonzinho.put("Nome", "Mariana");
				jsonzinho.put("Sobrenome", "Fonseca");
				jsonzinho.put("idade", 26);
				
				JSONObject jsonzinho2 = new JSONObject();
				jsonzinho2.put("Nome", "Mariana");
				jsonzinho2.put("Sobrenome", "Fonseca");
				jsonzinho2.put("idade", 26);
							
				System.out.println(jsonzinho);
				System.out.println(jsonzinho2);
				
				PrintWriter salvar = new PrintWriter("./src/main/java/teste4.json");
				salvar.write("[");
				salvar.write(jsonzinho.toJSONString());
				salvar.write(",");
				salvar.write(jsonzinho2.toJSONString());
				salvar.write("]");
				
				salvar.flush();
				salvar.close();
			}
	}
