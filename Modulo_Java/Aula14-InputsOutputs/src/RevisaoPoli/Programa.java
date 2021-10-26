package RevisaoPoli;

public class Programa {
	public void fazerAnimalComer(Animal animal) {
		animal.comer();
		}

		public static void main(String[] args) {
		Programa t = new Programa();
		t.fazerAnimalComer(new Animal());
		t.fazerAnimalComer(new Cao());
		t.fazerAnimalComer(new Leao());
		}
}
