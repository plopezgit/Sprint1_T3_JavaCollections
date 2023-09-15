package N1Exe3;

import java.util.HashMap;

public class Game {
	
	private String gameTitle;
	private String gamePlayer;
	private HashMap<String, String> gameCountriesListToGuess;
	private HashMap<String, Integer> gamePlayerPoints;
	private int gameAttempt;
	private int gamePoints;
	
	
	public Game(String gamePlayer) {
		this.gamePlayer = gamePlayer;
		gameTitle = "Guess the word";
		gameCountriesListToGuess = new HashMap<String, String>();
		gamePlayerPoints = new HashMap<String, Integer>();
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
		return gamePlayerPoints;
	}

	public void setGamePlayerPoints(HashMap<String, Integer> gamePlayerPoints) {
		this.gamePlayerPoints = gamePlayerPoints;
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


	public void start () {
		do {
			
		} while (gameAttempt == 10);
		
		gameOver ();
	}
	
	public HashMap<String, String> fullfilGameCountriesListToGuess () {
		return null;
	}
	
	public String getGuess () {
		return null;
	}
	
	public int gameLogic () {
		return 0;
	}
	
	public void gameOver () {
	}
	
	public void saveGamePlayerPoints () {
	}
	
	public void incrementAttemps () {
	}
	
	public void incrementPoints () {
	}

}
