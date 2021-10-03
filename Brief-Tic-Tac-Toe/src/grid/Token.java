package grid;

import player.Player;

public class Token {
	//Fields
	private char tokenChar;
	private Player owner;
	
	//Constructor
	public Token(char c, Player player) {
		this.tokenChar = c;
		this.owner = player;
		}
	//Methods
	@Override
	public String toString(){
		return Character.toString(this.tokenChar);
	}
	public Player getOwner() {
		return this.owner;
	}

}
