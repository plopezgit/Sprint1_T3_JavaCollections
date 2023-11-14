package kataArrayOrder;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Escribe un algorithm que tome una matriz y mueva todos los ceros hasta el final
		 * preservando el orden los demas elementos
		 */
		
		List<Integer> numbers2 = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(0);
		numbers.add(9);
		numbers.add(9);
		numbers.add(0);
		numbers.add(5);
		
		for (int i=0; i<= numbers.size()-1; i++) {
			if (numbers.get(i) != 0) {
				numbers2.add(numbers.get(i));
			} 
		}
				
		for (int i=0; i<= numbers.size()-1; i++) {
			if (numbers.get(i) == 0) {
				numbers2.add(numbers.get(i));
			} 
		}
		
		System.out.println(numbers2);

	}

}
