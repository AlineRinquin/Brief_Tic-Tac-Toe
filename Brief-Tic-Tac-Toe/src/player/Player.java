package player;

import grid.Token;

public class Player {
	//Fields
	private int id;
	private Token token;
	
	

	//Constructor
	public Player(int PlayerId, char c) {
		this.id = PlayerId;
		this.token = new Token(c, this);
	}
	
	
	
	// getters / setters
	public Token getToken() {
		return this.token;
	}
	
	//Methods
	@Override
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		
		if (other instanceof Player) {
			Player player =(Player)other;
		return player.id == this.id;
		} else {
			return false;
		}
	}
	
}
