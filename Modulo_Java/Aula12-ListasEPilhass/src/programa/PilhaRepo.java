package programa;

import java.util.Stack;

public class PilhaRepo {
	
	public static void inserindoPush(Stack pilhinha, String x ) {
		pilhinha.push(new String(x));
		System.out.println("push ->" + x);
		System.out.println("stack: " + pilhinha);
	}
	
	public static void deletandoPop(Stack pilhinha) {
		System.out.print("pop ->");
		String x = (String) pilhinha.pop();
		System.out.println(x);
		
		System.out.println("Stack: " + pilhinha);
		
	}

}
