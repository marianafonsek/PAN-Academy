package com.tarefaExtra3Json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class TarefaExtra2Json {
	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TarefaExtra2Json.class, args);

//		primerio precisamos declarar o caminho da pasta onde será escrito/lido o arquivo
		String caminhoArquivo = "./src/main/java/";

//		agora precisamos declarar o nome do arquivo e juntar com o caminho
		String nomeArquivo = "teste.json";
		String caminhoCompleto = caminhoArquivo + nomeArquivo;

		try {
//		Executa funcao que escreve os dados no formato JSON dentro do arquivo declarado la em cima
			escreveMultiplosObjetosJSON(caminhoCompleto);
			
//		Executa a funcao que percorre e le todos os dados no formato JSON e imprime na tela
			leMultiplosObjetosDoJSON(caminhoCompleto);
		} catch (IOException | ParseException e) {
			System.out.println(e.getMessage());
		}

	}
	
//		Lê o arquivo no formato JSON do caminho que declaramos, passando o parametro e impriminto os dados
	private static void leMultiplosObjetosDoJSON(String caminhoArquivo) throws IOException, ParseException {

//		Instancia um JSONParses que pega a String lida do arquivo com FileReader e  transforma em JSON
//		depois acontece um cast para o JSONArray
		JSONArray jsonArray = (JSONArray) new JSONParser().parse(new FileReader(caminhoArquivo));

//		Pega um iterator para JSONObject referente ao JSONArray lido
		Iterator<JSONObject> iteratorObjetoJSON = jsonArray.iterator();

//		Iteração por cada objeto JSON do array de objetos
		while (iteratorObjetoJSON.hasNext()) {
			
//			Pega o proximo objeto JSON no iterator e faz um cast para JSONObject
			JSONObject objetoJSONAtual = (JSONObject) iteratorObjetoJSON.next();

//			os atributos do objeto JSON atual vão para dentro de um Set de Map que guarda chave e valor
			Set<Map.Entry<String, String>> atributos = objetoJSONAtual.entrySet();
			
//			Interação cada atributo do objeto JSON imprimindo a chave e o valor de cada um deles
			for (Map.Entry<String, String> atributo : atributos) {
				
//				Imprime chave e valor separado dos atributos
				System.out.println("Chave: " + atributo.getKey() + " | Valor: " + atributo.getValue());
			}

//			 Imprime na tela
			System.out.println("-".repeat(50));
		}
	}

	private static void escreveMultiplosObjetosJSON(String caminhoArquivo) throws FileNotFoundException {
		
//		Instancia um objeto do tipo JSONObject e atribui valores para o objeto instanciado 
		JSONObject top = new JSONObject();
        top.put("Nome", "Topperosn");
        top.put("Sobrenome", "Leonardo");
        top.put("genero", "Doguinho");
         
          
//      mesma coisa do anterior :D
    	JSONObject mari = new JSONObject();
        mari.put("Nome", "Mariana");
        mari.put("Sobrenome", "Fonseca");
        mari.put("genero", "F");
         
                  
        
//      Adiciona os employeds na lista
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(top);
        jsonArray.add(mari);

		
//		 Instancia um objeto do tipo PrintWriter com o caminho do arquivo onde os dados serão escritos
		PrintWriter cadastrar = new PrintWriter(caminhoArquivo);
		
//		 Escreve os dados do jsonArray dentro do arquivo aberto
		cadastrar.write(jsonArray.toJSONString());

//		 Limpando o buffer do PrintWriter
		cadastrar.flush();

//		Fechando o arquivo
		cadastrar.close();
	}

}

// Fim! Mariana Fonseca - turma 3