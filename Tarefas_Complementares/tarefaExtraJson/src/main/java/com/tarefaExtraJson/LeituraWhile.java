package com.tarefaExtraJson;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeituraWhile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste.json"));

        JSONObject jsonzinho = (JSONObject) obj;

        System.out.println("");
        System.out.println("Tarefa Extra Usando while");

        //Usando while
        Iterator<String> iterator = jsonzinho.keySet().iterator();
        while (iterator.hasNext())
        {
            Object chave = iterator.next();
            Object valor = jsonzinho.get(chave);

            System.out.println(chave+":"+ valor);
        }
    }
}
