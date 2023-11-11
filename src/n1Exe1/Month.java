package n1Exe1;

public class Month {
	
	private String monthName;

	public Month(String monthName) {
		this.monthName = monthName;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	
	@Override
	public int hashCode() { //Comment to pass attempt to repetition
		final int prime = 31;
		int result = 1;
		result = prime * result + ((monthName == null) ? 0 : monthName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Month))
			return false;
		Month other = (Month) obj;
		if (monthName == null) {
			if (other.monthName != null)
				return false;
		} else if (!monthName.equals(other.monthName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Month: " + monthName;
	}

}

/*
 * Crea una clase llamada Month con un atributo "name" 
 * (que almacenará el nombre del mes del año). Añade 11 objetos Month 
 * (cada uno con su atributo diferente) en un ArrayList, 
 * a excepción del objeto con atributo "Agost". 
 * Después, efectúa la inserción en el sitio que corresponde a este mes y
 * demuestra que ArrayList mantiene el orden correcto.
 * Convierte ArrayList del ejercicio anterior en un HashSet 
 * y asegúrate de que no permite duplicados.
 * Recorre la lista con un for y con un iterador.
 */
