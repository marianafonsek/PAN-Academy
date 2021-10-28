package parte3;

import java.util.Locale;
import java.util.Scanner;

import parte2.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity");
		int quantity = sc.nextInt();
		
		if(sc.hasNextInt()) {
		Product product = new Product(name, price, quantity);
		System.out.println();
		System.out.println("Product data: " + product);
		}else {
			Product product = new Product(name, price, quantity);
			System.out.println();
			System.out.println("Product data: " + product);
		}
	}
}