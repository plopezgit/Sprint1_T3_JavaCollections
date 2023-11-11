package n1Exe3;

public class App {

	public static void main(String[] args) {
		
		Game game = new Game(Input.inputString("Your nickname: "));
		game.round();
		
	}
}
