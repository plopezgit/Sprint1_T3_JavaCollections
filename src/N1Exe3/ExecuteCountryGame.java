package N1Exe3;

public class ExecuteCountryGame {

	public static void main(String[] args) {
		
		Game game = new Game(Input.inputString("Your nickname: "));
		game.startRound();
		
	}

}

/*
 *Dado el archivo countrties.txt (revisa el apartado recursos) que contiene países 
 *y capitales. El programa debe leer el archivo y guardar los datos 
 *en un HashMap<String, String>. El programa pide el nombre del usuario/a, 
 *y después debe mostrar un país de forma aleatoria, guardado en HashMap. 
 *Se trata de que el usuario debe escribir el nombre de la capital del país en cuestión. 
 *Si acierta se le suma un punto. Esta acción se repite 10 veces. 
 *Una vez solicitadas las capitales de 10 países de forma aleatoria, 
 *entonces debe guardarse en un fichero llamado classificacio.txt, 
 *el nombre del usuario y su puntuación. 
 *
 *Code samples:
 *
 *	public void read () throws IOException {
		char letter;
		try {
			FileReader input = new FileReader 
					("/Users/pedrolopez/Proyectos/StreamAccessFiles/files/file.txt");
			
			BufferedReader buffer = new BufferedReader(input);
			
			String line = "";
			
			while (line != null) {
				line = buffer.readLine();
				System.out.print(line + "\n");
			}
		} catch (IOException event) {
			System.out.println("File not found.");
			//event.printStackTrace();
		}
	}
 *
 *
 *
 *	public static void saveItinerary (Itinerary currentItinerary) {
		try {
			FileWriter output = new FileWriter 
					("/Users/pedrolopez/Proyectos/Study/files/ItineraryLog.txt", true);
			BufferedWriter buffer = new BufferedWriter(output);
			buffer.write(LocalDate.now() + "\n" + currentItinerary.toString() + "\n");
			System.out.println("Itinerary has been saved on external file.");
			buffer.close();
		} catch (IOException event) {
			System.out.println("File not found.");
		}
	}
 *
 *
 *
 *
 *
 *
 */
