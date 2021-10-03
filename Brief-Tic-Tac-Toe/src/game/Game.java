package game;

import java.util.Random;
import java.util.Scanner;

import grid.Grid;
import io.Input;
import player.Player;

public class Game {
	//Fields
	private Grid grid;
	private Player player1;
	private Player player2;
	private Player currentPlayer;
	
	//Constructor
	public Game() {
		this.grid = new Grid();
		this.player1 = new Player(0, 'O'); //pensser a mettre des id différents entre les deux jouers
		this.player2 = new Player(1, 'X');
		
	}
	
	//Methods private pour m'aider 
	private void swapTurn() {
		if (this.currentPlayer.equals(this.player1))
			this.currentPlayer = this.player2;
		else 
			this.currentPlayer = this.player1;
	}
	
	private int getUserInput(Scanner scan) {
		int input = -1;
		
		while (true) {
			System.out.print("Player '" + this.currentPlayer.getToken() + "' ,your turn: ");
			input = Input.readInt(scan); 	
			if (0 <= input && input <= 8)
				break;
		}
		
		return input;
	}
	
	
	//Methods
	public void printGrid() {
		System.out.flush();
		System.out.println(this.grid);
	}
	
	
	public void start(Scanner scanner) {
		System.out.println("Welcome in Tic-Tac-Toe"+ "\n");
		
		currentPlayer = this.player1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String player1 = scan.nextLine();
		System.out.println("The first player is : " + player1 + "\n");
		
		System.out.println("Enter your name : ");
		String player2 = scan.nextLine();
		System.out.println("The second player is : " + player2 + "\n");
		
		String name []= {player1, player2};
		Random Tirage = new Random();
		int n = Tirage.nextInt(2);
		System.out.println("The beginer who play with 'O' is : " + name[n]+ "\n");
		 
		System.out.println("Enter a number between 0 and 8!"+ "\n");
		
		while (true) {
			printGrid();
			int input = getUserInput(scan);
			if (this.grid.checkIsEmpty(input)) {
				this.grid.setCaseToken(input, this.currentPlayer.getToken());
				
				
				if (this.grid.getWinner() != null) {
					// un joueur a gagne!
					printGrid();
					System.out.println("Player '" + this.currentPlayer.getToken() + "' won the game!!! Congratulations! ");
					break;
				}else if (this.grid.isFull()){
					printGrid();
					System.out.println(" Oh no! Nobody won the game :/ ! ");
					// match null
					break;
				}
				swapTurn();
				
			}
			
			else {
				System.out.println("CHOOSE AN OTHER CASE PLEASE!!!!!");
			}
		}
		
		scan.close();
	}
	
	
}
