package N1Exe3;

public class ExecuteCountryGame {

	public static void main(String[] args) {
		
		Game game = new Game(Input.inputString("Your nickname: "));
		game.round();
		
	}
}
