package entradas;

import java.util.Scanner;

public class ScanOutros {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
		short num2 = ler.nextShort(); // read user input
		System.out.println("short:....");
		System.out.println(num2);  //output user input
		
		long num3 = ler.nextLong(); //read user input
		System.out.println("Long:....");
		System.out.println(num3);
	
	}	
}

