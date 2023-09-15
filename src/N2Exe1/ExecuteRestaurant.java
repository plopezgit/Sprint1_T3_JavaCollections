package N2Exe1;

import java.util.HashSet;

public class ExecuteRestaurant {

	public static void main(String[] args) {
		HashSet<Restaurant> restaurantSet = new HashSet<Restaurant>();
		
		restaurantSet.add(new Restaurant("A",1));
		restaurantSet.add(new Restaurant("B",1));
		restaurantSet.add(new Restaurant("B",1)); //Attempt to repete
		restaurantSet.add(new Restaurant("B",2));
		
		for (Restaurant r : restaurantSet) {
			System.out.println(r);
		}
	}

}
