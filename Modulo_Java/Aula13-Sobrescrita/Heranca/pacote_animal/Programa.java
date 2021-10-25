package pacote_animal;

public class Programa {
	public static void maind(String[] args) {
		
		Gato gatinho1 = new Gato();
		gatinho1.dormir();
		gatinho1.peso = 7;
		gatinho1.raca = "Siameses";
		System.out.println("--------Sobre o gato--------");
		System.out.println(gatinho1.peso);
		
		
		Cachorro cachorrinho1 = new Cachorro();
		cachorrinho1.dormir();
		cachorrinho1.peso = 12;
		cachorrinho1.raca = "Labrador";
		System.out.println("--------Sobre o cachorro--------");
		System.out.println(gatinho1.peso);
		
	}
}
