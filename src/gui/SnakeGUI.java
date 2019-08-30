package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.JFrame;

public class SnakeGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SnakeGUI() {
//		JPanel panel = new JPanel();
//		getContentPane().add(panel);
		SnakeBoard sb = new SnakeBoard(new Rectangle(450,450));
		add(sb);
		setSize(450, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SnakeGUI s = new SnakeGUI();
		s.setVisible(true);
	}

}
