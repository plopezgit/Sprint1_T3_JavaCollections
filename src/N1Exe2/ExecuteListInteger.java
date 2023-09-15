package N1Exe2;

import java.util.*;

public class ExecuteListInteger {

	public static void main(String[] args) {
		
		List<Integer> integerList1 = new ArrayList<Integer>();
		integerList1.add(1);
		integerList1.add(2);
		integerList1.add(3);
		integerList1.add(4);
		
		List<Integer> integerList2 = new ArrayList<Integer>();
		integerList2.add(1);
		integerList2.add(2);
		integerList2.add(3);
		integerList2.add(4);
		
		ListIterator<Integer> iterator = integerList2.listIterator(4);
		while (iterator.hasPrevious()) {
			integerList1.add(iterator.previous());
		}
		
		for (Integer m : integerList1) {
			System.out.println(m);
		}
	}
}

/*
 * Crea y rellena un List<Integer>.
 * Crea un segundo List<Integer> e inserta en la segunda lista 
 * los elementos de la primera en orden inverso.
 * Emplea los objetos ListIterator para leer 
 * los elementos de la primera lista e insertarlos en la segunda.
 */ 
 
