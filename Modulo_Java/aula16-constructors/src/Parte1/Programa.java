package Parte1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Product product = new Product();
	System.out.print("name: ");
	product.name = sc.nextLine();
	System.out.print("Price:  ");
	product.price = sc.nextDouble();
	
	
	if (sc.hasNextInt()) {
		System.out.print("Quantifade no estoque: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data:" + product);
	}else {
		System.out.println();
		System.out.println("Product data: " + product);
	}
	
	sc.close();

	}
}
