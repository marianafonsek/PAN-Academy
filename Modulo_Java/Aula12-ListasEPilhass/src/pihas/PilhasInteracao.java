package pihas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhasInteracao {
		
		public static void main(String[] args) {

		Stack<Integer> pilhaList = new Stack<>();
		pilhaList.push(68);
		pilhaList.push(118);
		pilhaList.push(90);
		pilhaList.push(720);
		pilhaList.pop();
		
		ArrayList<String> listArray = new ArrayList<>();
		listArray.add("ArrayList 1");
		listArray.add("ArrayList 2");
		
		List<String> listList = new ArrayList<>();
		listList.add("Lista 1");
		listList.add("lista 2");
		
		
		System.out.println("interar lista");
		Iterator<String> interList = listList.iterator();
		while (iterList.hasNext()) {
			String iterado = iterList.next();
			System.out.println(iterado);
		}
		
		System.out.println("interar Array");
		Iterator<String> interArray = listArray.iterator();
		while (iterArray.hasNext()); {
			String iterado = iterArray.next();
			System.out.println(iterado);
		}
		
		System.out.println("interar Pilha");
		Iterator<String> iterPilha = pilhaList.iterator();
		while (iterPilha.hasNext()); {
			String iterado = iterPilha.next();
			System.out.println(iterado);
		
			}
		}
	}
