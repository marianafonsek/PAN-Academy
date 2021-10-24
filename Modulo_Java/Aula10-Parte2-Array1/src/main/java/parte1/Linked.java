package parte1;

import java.util.LinkedList;

public class Linked {

	public static void mains(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		// ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("EcoSport");
		cars.add("Mercedes");
		cars.add("Fox");
		cars.add("Gol");
		
		System.out.println(cars.contains("Gol"));
		cars.addFirst("Palio");
		cars.addLast("Mazda");
//		cars.removeLast();
		System.out.println(cars.get(0));
		System.out.println(cars.getLast());
		cars.clear();
//		System.out.println(cars);
		
		LinkedList<String> list = new LinkedList<String>();
//		use add() method to add elements in the list 
		list.add("Geeks");
		list.add("for");
		
//		check if the list contains geeks
		System.out.println("Does the list contains 'Geeks' :" + list.contains("Geeks"));
			
	}
}
