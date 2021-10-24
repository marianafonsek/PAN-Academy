package parte1;
	
	import java.util.ArrayList;
	import java.util.HashMap;

	public class AquecimentoListaArray {
		
		public static void main(String[] args) {
			
			HashMap<String, String> hashMapinho = new HashMap<>();
			hashMapinho.put("procuro", "fui achado hash");
			hashMapinho.put("procuro2", "fui achado hash 2");
			
			String value = hashMapinho.get("procuro");
			System.out.println(value);
			
			
//			-----------------------------------
			
			ArrayList<String> lista = new ArrayList<>();
			lista.add("topico 1 da lista achou");
			lista.add("topico 2 da lista achou");
			String str1 = lista.get(0); //str recebera St
			System.out.println(str1);
//			
		}

	}
