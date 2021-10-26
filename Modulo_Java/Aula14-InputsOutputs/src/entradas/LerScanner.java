package entradas;

import java.util.Scanner;

public class LerScanner {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in); // create a scanner object
		System.out.println("Enter username");

		String userName = myObj.nextLine();
		System.out.println("username is: " + userName);	
		
		System.out.println("Enter your age");
		int userAge = myObj.nextInt();
		System.out.println("your age is " + userAge);		

		
	}
}
