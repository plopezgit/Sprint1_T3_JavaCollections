package N2Exe2;

//import java.util.Comparator;

public class Restaurant implements Comparable<Restaurant>/*, Comparator<Restaurant>*/ {
	private String restaurantName;
	private int restaurantPoints;

	public Restaurant(String restaurantName, int restaurantPoints) {
		this.restaurantName = restaurantName;
		this.restaurantPoints = restaurantPoints;
	}
	
	
	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRestaurantPoints() {
		return restaurantPoints;
	}

	public void setRestaurantPoints(int restaurantPoints) {
		this.restaurantPoints = restaurantPoints;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
		result = prime * result + restaurantPoints;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Restaurant))
			return false;
		Restaurant other = (Restaurant) obj;
		if (restaurantName == null) {
			if (other.restaurantName != null)
				return false;
		} else if (!restaurantName.equals(other.restaurantName))
			return false;
		if (restaurantPoints != other.restaurantPoints)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Restaurant= " + restaurantName + ", Points= " + restaurantPoints;
	}


	@Override
	public int compareTo(Restaurant restaurant) {
		return restaurantPoints - restaurant.restaurantPoints;
	}
	
	/*@Override
	public int compare(Restaurant restaurant1, Restaurant restaurant2) {
		String restaurantNameToCompare1 = restaurant1.getRestaurantName();
		String restaurantNameToCompare2 = restaurant2.getRestaurantName();
		return restaurantNameToCompare2.compareTo(restaurantNameToCompare1);
	}*/
	
}

/*
 * Crea la implementación 
 * necesaria para que los objetos de la clase Restaurante estén 
 * ordenados por nombre y por puntuación en orden ascendente.
 * Ejemplo:
 * nombre: restaurant1, puntuación: 8
 * nombre: restaurant1, puntuación: 7
 * 
 * Crea una clase llamada Restaurante con dos atributos: 
 * nombre(String) y puntuación(int). 
 * Implementa los métodos necesarios para que no se puedan 
 * introducir objetos Restaurante con el mismo nombre y
 * puntuación en un HashSet creado en el main() de la aplicación.
 * Importante
 * Puede haber restaurantes con el mismo nombre con distinta puntuación, 
 * pero no puede haber restaurantes con el mismo nombre y igual puntuación.
 */
