package com.tarefaExtraJson;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TarefaExtraJsonApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TarefaExtraJsonApplication.class, args);
		
		JSONObject json = new JSONObject();

        json.put("Nome", "Mariana");
        json.put("Sobrenome", "Fonseca");
        json.put("Idade", "26");
        json.put("Nome", "Mariana");
        json.put("Sobrenome", "Fonseca");
        json.put("Idade", "26");

        System.out.println(json);

        // write json to file
        PrintWriter salvar = new PrintWriter("./src/main/java/teste.json");
        salvar.write(json.toJSONString());

        salvar.flush();
        salvar.close();
	}

}
