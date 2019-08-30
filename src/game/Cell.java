package game;

public class Cell {
	private Actor actor;
	
	public Cell() {
		actor = null;
	}
	
	public Cell(Actor actor) {
		this.actor = actor;
	}
	
	public boolean isBG() {
		return actor != null;
	}
	
	public boolean getActor() {
		return actor;
	}
}
