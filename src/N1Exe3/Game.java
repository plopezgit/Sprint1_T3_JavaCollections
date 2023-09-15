package N1Exe3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Game {

	private String gamePlayer;
	private HashMap<String, String> gameCountryCapitalMapToGuess;
	private HashMap<String, Integer> gamePlayerPointMapClassification;
	private Object country;
	private String gamePlayerCapitalGuess;
	private int gameAttempt;
	private int playerPoints;

	public Game(String gamePlayer) {
		this.gamePlayer = gamePlayer;
		gameCountryCapitalMapToGuess = new HashMap<String, String>();
		gamePlayerPointMapClassification = new HashMap<String, Integer>();
		gamePlayerCapitalGuess = "";
		country = "";
		gameAttempt = 10;
		playerPoints = 0;

	}

	public void round() {
		fullfillGameCountryCapitalMapToGuess();
		gameLogic();
		gameOver();
	}

	public HashMap<String, String> fullfillGameCountryCapitalMapToGuess() {
		try {
			FileReader input = new FileReader 
					("/Users/pedrolopez/Desktop/countries.txt");
			
			BufferedReader buffer = new BufferedReader(input);
			String line;
			while ((line = buffer.readLine()) != null) {
				String[] part = line.split("\\s+");
				gameCountryCapitalMapToGuess.put(part[0], part[1]);
				}
		} catch (IOException event) {
			System.out.println("File not found.");
		}		
		return gameCountryCapitalMapToGuess;
	}

	public void getGuess() {
		gamePlayerCapitalGuess = Input.inputString("Guess the capital: ");
	}

	public void gameLogic() {
		Random random = new Random();
		Object[] countries = gameCountryCapitalMapToGuess.keySet().toArray();
		for (int i=0; i<gameAttempt; i++) {
			country = countries[random.nextInt(countries.length)];
			System.out.println(country);
			getGuess();
			if (gameCountryCapitalMapToGuess.get(country).equals(gamePlayerCapitalGuess)) {
				incrementGamePoints();
			}
		} 

	}

	public void gameOver() {
		gamePlayerPointMapClassification.put(gamePlayer, playerPoints);
		saveGamePlayerPoints();
		askNewRound();

	}

	public void saveGamePlayerPoints() {

		try {
			FileWriter output = new FileWriter("/Users/pedrolopez/Proyectos/Study/files/Classification.txt", true);
			BufferedWriter buffer = new BufferedWriter(output);
			buffer.write(LocalDate.now() + "\n" + gamePlayerPointMapClassification.toString() + "\n");
			System.out.println("Your Classification has been saved on external file.");
			buffer.close();
		} catch (IOException event) {
			System.out.println("File not found.");
		}
	}

	public void incrementGamePoints() {
		playerPoints++;
	}

	public void askNewRound() {
		if (Input.inputYesNo("Do you want to play again (Yes/No): \n")) {
			round();
		} else {
			System.exit(0);
		}
	}

}
