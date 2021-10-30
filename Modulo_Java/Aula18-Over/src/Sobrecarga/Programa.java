package Sobrecarga;

public class Programa {
	static int somando(int x, int y) {
		return x + y;
	}
	
	static double somando(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int myNumber1 = somando(3, 5);
		double myNumber2 = somando(3.3, 3.26);
		System.out.println("int: " + myNumber1);
		System.out.println("double: " + myNumber2);
	}

}
