package N2Exe2;

import java.util.*;

public class ExecuteRestaurant {

	public static void main(String[] args) {
		HashSet<Restaurant> restaurantSet = new HashSet<Restaurant>();
		
		restaurantSet.add(new Restaurant("1",3));
		restaurantSet.add(new Restaurant("2",5));
		restaurantSet.add(new Restaurant("3",1));
		restaurantSet.add(new Restaurant("3",1)); //Attempt to repete
		restaurantSet.add(new Restaurant("3",2));
		
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