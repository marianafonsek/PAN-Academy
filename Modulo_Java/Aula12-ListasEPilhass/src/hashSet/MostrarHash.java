package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MostrarHash {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		
	
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() +  "");
		}
		
		
		System.out.println();
		HashSet<Integer> dset = new HashSet<>();
		dset.add(2);
		dset.add(12);
		dset.add(63);
		dset.add(34);
		
		System.out.print("hashSet");
		Iterator<Integer> iterator1 = dset.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator.next() + "");
		}
	}

}
