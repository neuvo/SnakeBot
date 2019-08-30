package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.JPanel;

/*
 * Represents the game board
 */
public class SnakeBoard extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//The size of the entire panel - auto updates when scaled
//	private double exactWidth = 0;
//	private double exactHeight = 0;
	private Rectangle exactRectangle = null;
	
	private HashMap<Color, Color> checkers;
	
	public SnakeBoard(Rectangle inDimensions) {
//		exactWidth = inDimensions.getWidth();
//		exactHeight = inDimensions.getHeight();
		exactRectangle = new Rectangle();
		exactRectangle.setBounds(inDimensions);
		checkers = new HashMap<Color, Color>();
		checkers.put(Color.BLACK, Color.WHITE);
		checkers.put(Color.WHITE, Color.BLACK);
		
//		pixelWidth = (int) (exactRectangle.getWidth());
//		pixelHeight = (int) (exactRectangle.getHeight());
//		this.setBackground(Color.BLACK);
//		this.render();
		
	}
	


	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
//		Rectangle2D rec = new Rectangle2D.Double();
//		rec.setFrame(30,30,420,420);
//		g2.setColor(Color.BLACK);
//		g2.draw(rec);
//		g2.setColor(Color.RED);
//		Line2D lin = new Line2D.Float(100, 100, 250, 260);
//		g2.draw(lin);
//		g2.setColor(Color.GREEN);
//		g2.fillRect(0,0,30,30);
		Color currColor = Color.BLACK;
		int boxWidth = getWidth() / 10;
		int boxHeight = getHeight() / 10;
		for (int r = 0; r < 10; ++r) {
			if (r % 2 == 0) currColor = Color.BLACK;
			else currColor = Color.WHITE;
			for (int c = 0; c < 10; ++c) {
				g2.setColor(currColor);
				g2.fillRect(r*boxWidth, c*boxHeight, r*boxWidth+boxWidth, c*boxHeight+boxHeight);
				currColor = checkers.get(currColor);
			}
		}
	}
	
}
