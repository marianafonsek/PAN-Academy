package metodo.com.retorno;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Criando um objeto com retorno");
		MetodoRetorno teste = new MetodoRetorno();
		teste.atributo1 = 30;
		System.out.println(teste.atributo1);
		System.out.println(teste.metodo1());
	}
}