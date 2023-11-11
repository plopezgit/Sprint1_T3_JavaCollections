package n2Exe2;

import java.util.*;

public class App {

	public static void main(String[] args) {
		HashSet<Restaurant> restaurantSet = new HashSet<Restaurant>();
		
		restaurantSet.add(new Restaurant("rest1",3));
		restaurantSet.add(new Restaurant("rest2",5));
		restaurantSet.add(new Restaurant("rest3",1));
		restaurantSet.add(new Restaurant("rest3",1)); //Attempt to repete
		restaurantSet.add(new Restaurant("rest3",2));
		
		for (Restaurant r : restaurantSet) {
			System.out.println(r);
		}
		
		System.out.println("-");
		TreeSet<Restaurant> list = new TreeSet<Restaurant>(restaurantSet);
		
		for (Restaurant r : list) {
			System.out.println(r);
		}
		
		
	}

}
