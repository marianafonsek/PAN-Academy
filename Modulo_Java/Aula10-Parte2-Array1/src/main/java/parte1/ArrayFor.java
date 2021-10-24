package parte1;

import java.util.ArrayList;

public class ArrayFor {
	
	public static void main(String [] args) {
		
	ArrayList<String> pessoas = new ArrayList<>();
	
	pessoas.add("Mariana");
	pessoas.add("Luiza");
	pessoas.add("Fulano");
	System.out.println("---------Todas as pessoas-------------");
	for (String pessoinha: pessoas) {
		System.out.printf("Posição %s\n", pessoinha);
	}
	
	System.out.println("---------comeca com L-------------");
	for (String pessoinha: pessoas) {
			if (pessoinha.charAt(0) == 'L') {
		System.out.printf("Posição %s\n", pessoinha);
    }
		}
	
	System.out.println("---------Pessoas e indices-------------");
	System.out.println("Indo de um por um");
	int i = 0;
	for (String string : pessoas) {
		System.out.printf("posiçõa %d- %s%n", i, string);
		i++;
	}
  }
}
