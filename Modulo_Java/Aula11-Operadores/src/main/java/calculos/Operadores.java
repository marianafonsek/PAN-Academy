package calculos;

public class Operadores {
	
	public static void main(String[] args) {
		int a = 5;
		a += 3;
		System.out.println(a);
		
		int b = 5;
		b -= 3;
		System.out.println(b);
		
		int c = 5;
		c *= 3;
		System.out.println(c);
		
		int s = 5;
		int t = 3;
		System.out.println(s == t);
		System.out.println(s != t);
		System.out.println(s >= t);
		
		int x  = 5;
		System.out.println("int x = 5");
		System.out.println("(x < 3 && x == 5)");
		System.out.println(x < 3 && x == 5);
		System.out.println("(x < 3 || x == 5)");
		System.out.println(x < 3 || x == 5);
		System.out.println("(x < 3 && x < 10)");
		
		int perfomace = 10;
		if (perfomace >=9 && x < 10) {
			System.out.println("otimo player" + perfomace);
						
		}else if
		(perfomace >= 8 && x < 9) {
			System.out.println("Mediano player:" + perfomace);
			
		}
		else {
			System.out.println("Desqualificado");
		}
	}
	

}
