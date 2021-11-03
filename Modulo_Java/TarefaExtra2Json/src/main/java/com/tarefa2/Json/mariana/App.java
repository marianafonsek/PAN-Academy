package com.tarefa2.Json.mariana;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.CDL;
import org.json.Cookie;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.Property;
import org.json.XML;



public class App {
	public static void main(String[] args) {
//		lista comm os metodos utilizados na app
//		JSONObjectToArray();
//		JSONExampleArray1();
//		JSONExampleArray2();
//		JSONExampleStringer();
//		JSONExampleObject1();
//		JSONExampleObject2();
//		JSONExampleObject3();
//		XMLToExampleConversion();
//		XMLFromExampleConversion();
//		CookieToExampleConversion();
//		CookieFromExampleConversion(); 
//		HTTPToExampleConversion();
//		HTTPFromExampleConversion();
//		CDLToExampleConversion();
//		CDLFromExampleConversion();
//		PropertyToExampleConversion();
//		PropertyFromExampleConversion();
	}
	
	
//	A função cria um JSONObject a partir da array
	private static void JSONExampleArray1() {

//		array declarada em formato de string
		 String arrayStr = "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
		                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
		            		"{"+"\"key1\":\"value1\","+"\"key2\":\"value2\","+
		                    "\"key3\":\"value3\","+"\"key4\":\"value4\""+"},"+ "0,"+"\"-1\""+"]";

//		Usamos um constructor para iniciar o JSON array
		  JSONArray array = new JSONArray(arrayStr);
		  System.out.println("Values array: "+ array);

//		  Converte o array para um JSON array
//		  criou outra array JSON como uma "função auxiliar"
		  JSONArray list = listNumberArray(array.length());
 		  System.out.println("Label Array: "+ list.toString());
		  
//		  uniu as duas array JSON em um único JSONObject
		  JSONObject object = array.toJSONObject(list);
		  System.out.println("Final JSONOBject: " + object);
	}

//	Função auxiliar que cria um array JSON de acordo com sua posição
	private static JSONArray listNumberArray(int max){
		 JSONArray res = new JSONArray();
		for (int i=0; i<max;i++) {
			res.put(String.valueOf(i));
		}
		return res;
	}
	
	
	private static void JSONExampleArray2() {

//		Array vazia que vai add varios tipos de elementos/objetos pra ela.
//		instancia um array JSON
		  JSONArray array = new JSONArray();

//		PUT - adiciona os elementos na array, e na sequencia convertemos pra um JSONOBject
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);
		JSONArray list = listNumberArray(array.length());
		 JSONObject object = array.toJSONObject(list);
		 System.out.println("Final JSONOBject: " + object);
	}
	
//		Iniciando  o JsonStringer

	private static void JSONExampleStringer() {

		JSONStringer jsonStringer = new JSONStringer();

		jsonStringer.object();

//      Vai adicionando os elementos no objeto com a chave de conforme seu valor 
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);
        jsonStringer.endObject();

//       Converte para JSONObject
        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);
        
       System.out.println("Final JSONOBject: " + jsonObject);
	}
	
	
	private static void JSONExampleObject1() {

//		cria um objetoo que passa uma string como parametro 
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		System.out.println("Final JSONObject: " + example);
		
	}
	
	private static void JSONExampleObject2() {

//		JSONObject é criado sem utilizar outras funções
		JSONObject example = new JSONObject();
		
//		adiciona atraves do put uma forma de chave valor com a primeira 
//		sendo a chave e a segunda o valor atribuido
		example.put("key", "value");
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);
		
//		Não aceita adicionar valores nulos, vazios
		 System.out.println("Final JSONOBject: " + example);
	}
	
	private static void JSONExampleObject3() {

//		JSONObject criado usando um JAVA MAP
//		no map as chaves serão strings e os valores double
		Map<String,Double> map = new HashMap<String, Double>();		
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);
		
//		objeto com o parametro MAP
		JSONObject example = new JSONObject(map);
		 System.out.println("Final JSONOBject: " + example);
	}
	
	
//	Conversão do JSONObject para um JSONArray
//	primeiro criamos um objeto json
	private static void JSONObjectToArray() {
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		
//		Lista de strings com as chaves
		JSONArray keyStrings = listNumberArray(example.length());
		
//		agora faz a conversão usando o toJSONArray"		
		JSONArray array = example.toJSONArray(keyStrings);
		System.out.println("Final JSONArray: " + array);
	}

//	Convertendo XML para String, criando primeiro um objeto JSON
	private static void XMLToExampleConversion() {
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);

//		Agora faz a conversão do xml para string
		String output = XML.toString(example);
		System.out.println("Final XML: " + output);
	}
	
//	Cria um JSONObject e passa a string no formato xml 
	private static void XMLFromExampleConversion() {
		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

//		obtem o e parametro do JSONObject
		JSONObject output = XML.toJSONObject(string);		
		System.out.println("Final JSONObject: " + output);
	} 
	
//	Transforma o JSONObject em cookie
	private static void CookieToExampleConversion() {

// é obrigatorio prencher o nome do cookie e ele não aceita valores booleanos
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		JSONObject example = new JSONObject(string);
		
//		String com formato de cookie passando o JSONObject
		String output = Cookie.toString(example);
		System.out.println("Final Cookie: " + output);
	}
	
	
//	fazendo o contrario agora, transformando um cookie para JSON
	private static void CookieFromExampleConversion() {

//		String no formato de cookie
		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

//		Conversão do cookie para JSONObject com a string como parametro
		JSONObject output = Cookie.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}
	
	
//		JSONObject que tem que ter o header para uma requisição http
	private static void HTTPToExampleConversion() {
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";
		JSONObject example = new JSONObject(string);
		
//		String no formato http que passa o JSONObject como parametro
		String output = HTTP.toString(example);
		System.out.println("Final HTTP: " + output);
	}
	
	
//		conversão de string http para JSONObject
	private static void HTTPFromExampleConversion() {

//		String com formato http, na sequencia a gente faz a conversão dela para JSOObject
		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";
		JSONObject output = HTTP.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}
	
	
	private static void CDLToExampleConversion() {
		
//		JSONObject com valores atribuidos nas chaves, mas valores diferentes
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
		JSONObject example2 = new JSONObject(string2);
		
//		JSONArray com oJSONObject
		JSONArray array = new JSONArray();
		array.put(example);
		array.put(example2);

//		String no formato CDL que passa a array como parametro
		String output = CDL.toString(array);
		System.out.println("Final CDL: \r\n" + output);
	}
	
	private static void CDLFromExampleConversion() {
		String string = "0,1,2,3\n" + "value,5,-2.345E+68,true\n"+ "value2,6,-8.345E+68,false";
		
//		Converte a string para JSONObjectt
		JSONArray output = CDL.toJSONArray(string);
		System.out.println("Final JSONArray: " + output);
	}
	
	
//		JSONObject vira properties. 
//		começa com um JSONObject e o "toProperties" faz ele começar a agir como um properties
	private static Properties PropertyToExampleConversion() {
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		Properties output = Property.toProperties(example);
		System.out.println("Final Properties: " + output);

		return output;
		}
	
//		Contrario, agora o properties que ta se transformando no JSONobject
	private static void PropertyFromExampleConversion() {

//		Mesma coisa, mas ao contrario, agora começa com um objeto properties que 
//		passa o input como parametro pro "toJSONObject"
		Properties input = PropertyToExampleConversion();
		JSONObject output = Property.toJSONObject(input);
		System.out.println("Final JSONObject: " + output);
	}	
}


// fim, Mariana Fonseca - turma 3