package programe;

import game.Game;


public class Program {

	public static void main(String[] args) {
		Game game = new Game();
		game.start(null);
		
		System.out.println("This is the END");
		System.out.println(" You can clear the console to replay");
	}
  
}
