package game;

import java.util.List;

public class SnakeGameMaster {
	private List<Integer> theSnake;
	private int boardWidth;
	private int boardHeight;
	
	public SnakeGameMaster(int boardWidth, int boardHeight) {
		this.boardWidth = boardWidth;
		this.boardHeight = boardHeight;
	}
}
