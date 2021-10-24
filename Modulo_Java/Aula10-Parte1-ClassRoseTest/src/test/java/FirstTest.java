import org.junit.Test;


// A anotação deve ser publica, e não pode ter retorno

// conslehos: melhor colocar o nome do metodo mais cumprido 
//do que colocar comentarios ao  longo do codigo, pois assim
//teremos um cod limpo e auto explicativo


public class FirstTest {

	@Test
//	public void MetodoUm() -- nome curto que necessitaria de um comentario
	public void metodoDeExemploDeTesteValido() {  //nome ideal
	}

	
//	 @Test
	 public String MetodoDoExemploDeTesteInvalidoStringReturn() {
	 return "";
	}
	  
	
//	 esse terceiro vai dar erro pq é string e ta retornando algo
	 
	 @Test
	private void MetodoTres () {
	}
	
	@Test
	public void MetodoQuatro () {
	}
	
	@Test
	public void MetodoDeExemploComImpressaoDeTela() {
		System.out.println("teste 1 executado!");
	}
	
	@Test
	public void MetodoDeExemploComImpressaoDeTela2() {
		System.out.println("teste 2 executado!");
	}
	

	//	Se nao tiver a notacao o JUnit ignora completamente o que esta codado
//	basta comentar a notacao, o restante sera ignorado.
	
//	@Test
	public void MetodoNaoETeste() {
		System.out.println("Esta mensagem nao deve aparecer!");
	}
}
