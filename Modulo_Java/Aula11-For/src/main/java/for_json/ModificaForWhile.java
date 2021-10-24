package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificaForWhile {

	public static void main(String[] args) {
		
////		//FOR util se conhece o tamanho do array
////		for (int i = 0; i < 5; i++) {
////		System.out.println(i);
////		}
////		
////		//use um forloop para imprir consegui 5 vzs o num de tentativas
////	
////		
////		//while para quando queremos
////	String example = "2021.10.10";
////	Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
////	Matcher matcher = pattern.matcher(example);
////	//verifies full match
////	
////	while (matcher.find()) {
////		System.out.println(matcher.group());
////	}
//	
//	Pattern p = Pattern.compile("\\d+");
//	Matcher m = p.matcher("hello1234goodbay789very2345");
//	while (m.find()) {
//		System.out.println(m.group());
//	}
//	
	String text = "John speak  and John writes about that,\"\r\n" + 
			"				+ \" and John think 2021.10.10 about everything.\r\n";
	String nominho = "(Jhon)";
	Pattern patternNominho = Pattern.compile(nominho);
	Matcher matcherNominho = patternNominho.matcher(text);
	
	while (matcherNominho.find()) {
		System.out.println("found: " + matcherNominho.group());
		
	}
}
}