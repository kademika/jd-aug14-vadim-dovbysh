/*
 * Copyright (c) 2014 kademika.com
 */
package day2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplateRandom extends JPanel {

	boolean COLORDED_MODE = true;

	int tankX = 0;
	int tankY = 0;

	long speed = 10;

	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {


		while(true){
		    move(1);
		    	
		    Thread.sleep(200);
			repaint();
		}
	}

	
	
	 
		
		
		
	
		

	// get quadrant
static String getQuadrant(String v, String h) {

		int hor = Integer.valueOf(h);
		int vert = 1;
		if (v.equals("a")){
			vert = 1;
		}
		else if (v.equals("b"))
			vert = 2;
		if (v.equals("c"))
			vert = 3;
		if (v.equals("d"))
			vert = 4;
		if (v.equals("e"))
			vert = 5;
		if (v.equals("f"))
			vert = 6;
		if (v.equals("g"))
			vert = 7;
		if (v.equals("h"))
			vert = 8;
		if (v.equals("i"))
			vert = 9;

		return (vert - 1) * 64 + "_" + (hor - 1) * 64;
		//int x = (vert - 1) * 64;
		//int y = (hor - 1) * 64;

		
	}

	/**
	 * direction /"1 up" /"2 down" /"3 left" /"4 right"
	 * 
	 * @param direction
	 */
	void move(int direction) {

		int step = 64;
		if ((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0)
				|| (direction == 4 && tankX >= 512)) {
			System.out.println("[Illegal move] " + " tankX:" + tankX
					+ " tankY:" + tankY);

			return;
		}

		if (direction == 1) {
			tankY -= step;
			System.out.println("Direction UP " + direction + " tankX:" + tankX
					+ "tankY: " + tankY);
		}
		if (direction == 2) {
			tankY += step;
			System.out.println("Direction DOWN " + direction + " tankX:"
					+ tankX + "tankY: " + tankY);
		}
		if (direction == 3) {
			tankX -= step;
			System.out.println("Direction RIGHT " + direction + " tankX:"
					+ tankX + "tankY: " + tankY);
		}
		if (direction == 4) {
			tankX += step;
			System.out.println("Direction LEFT " + direction + " tankX:"
					+ tankX + "tankY: " + tankY);
		}

	}

	// random move for tank
	/**
	 * static int moveRandom() { 
	 * int randDir = (int)((Math.random() * 4) + 1);
	 * return randDir; }
	 */
	

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 592;
	final int BF_HEIGHT = 592;

	public static void main(String[] args) throws Exception {
		BattleFieldTemplateRandom bf = new BattleFieldTemplateRandom();
		bf.runTheGame();
	}

	public BattleFieldTemplateRandom() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}

		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}