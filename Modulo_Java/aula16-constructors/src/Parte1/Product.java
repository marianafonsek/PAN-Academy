package Parte1;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	//metodo to Strinf organiza o codigo nao precisa ser invocado
	public String toString() {
		return name + ",$" + price + ", " + quantity;
	}

}
