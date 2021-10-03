package grid;

import player.Player;

public class GridCase {

	//Fields
	private int id;
	private Token content;
	//Constructor
	public GridCase(int caseId) {
		this.id = caseId;	
		this.content = null;
	}
	public GridCase(int caseId , Token token) {
		this.id = caseId;	
		this.content = token;
	}
	
	// getters / setters
	public Player getTokenOwner() {
		if (this.content != null)
			return this.content.getOwner();
		else 
			return null; 
	}
	
	public void setToken(Token token) {
		this.content = token;
	}
	
	//Methods
	public boolean isEmpty() {
		return this.content == null;	
	}
	
	@Override
	public String toString() {
		if (this.content != null)
			return this.content.toString();
		else
			return Integer.toString(this.id);
		
	}
}
