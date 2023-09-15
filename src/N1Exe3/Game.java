package N1Exe3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class Game {
	
	private String gameTitle;
	private String gamePlayer;
	private HashMap<String, String> gameCountriesListToGuess;
	private HashMap<String, Integer> gamePlayerPointsClassification;
	private int gameAttempt;
	private int gamePoints;
	
	
	public Game(String gamePlayer) {
		this.gamePlayer = gamePlayer;
		gameTitle = "Guess the word";
		gameCountriesListToGuess = new HashMap<String, String>();
		gamePlayerPointsClassification = new HashMap<String, Integer>();
		gameAttempt = 0;
		gamePoints = 0;
		
	}
	
	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getGamePlayer() {
		return gamePlayer;
	}

	public void setGamePlayer(String gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	public HashMap<String, String> getGameCountriesListToGuess() {
		return gameCountriesListToGuess;
	}

	public void setGameCountriesListToGuess(HashMap<String, String> gameCountriesListToGuess) {
		this.gameCountriesListToGuess = gameCountriesListToGuess;
	}

	public HashMap<String, Integer> getGamePlayerPoints() {
		return gamePlayerPointsClassification;
	}

	public void setGamePlayerPoints(HashMap<String, Integer> gamePlayerPoints) {
		this.gamePlayerPointsClassification = gamePlayerPoints;
	}

	public int getGameAttempt() {
		return gameAttempt;
	}

	public void setGameAttempt(int gameAttempt) {
		this.gameAttempt = gameAttempt;
	}

	public int getGamePoints() {
		return gamePoints;
	}

	public void setGamePoints(int gamePoints) {
		this.gamePoints = gamePoints;
	}


	//Class methods


	public void startRound () {
		
		fullfilGameCountriesListToGuess ();
		
		do {
			
			gameLogic (getGuess ());
			
			incrementAttemps ();
			incrementPoints ();
			
		} while (gameAttempt == 10);
		
		gameOver ();
	}
	
	public HashMap<String, String> fullfilGameCountriesListToGuess () {
		return null;
	}
	
	public String getGuess () {
		return null;
	}
	
	public int gameLogic (String guess) {
		return 0;
	}
	
	public void gameOver () {
		saveGamePlayerPoints ();
		askNewRound ();
		
	}
	
	public void saveGamePlayerPoints () {
		
		try {
			FileWriter output = new FileWriter 
					("/Users/pedrolopez/Proyectos/Study/files/Classification.txt", true);
			BufferedWriter buffer = new BufferedWriter(output);
			buffer.write(LocalDate.now() + "\n" + gamePlayerPointsClassification.toString() + "\n");
			System.out.println("Your Classification has been saved on external file.");
			buffer.close();
		} catch (IOException event) {
			System.out.println("File not found.");
		}
	}
	
	public void incrementAttemps () {
	}
	
	public void incrementPoints () {
	}
	
	public void askNewRound () {
		 if (Input.inputYesNo("Do you want to play again")) {
			 startRound();
		 } else {
			 System. exit(0);
		 }
	}

}
