/*
 * Copyright (c) 2014 kademika.com
 */
//incoming parameters is int in method "moveToQuadrant"
//with variable "tankDirection" and modified method "move(int direction)"

package day3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;

	int tankX = 0;
	int tankY = 0;
	
	
	int bulletX = -100;
	int bulletY = -100;
	
	int bulletSpeed = 5;
	long speed = 1000;
	// 1-up 2-down 3-left 4-right
	int tankDirection = 1;
	
	String[][] battleField = {
							 {"B", " ", " ", "B", "B", "B", " ", " ", "B"},
							 {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
			                 {"B", "B", "B", "B", " ", "B", "B", "B", "B"},
			                 {"B", " ", " ", " ", "B", " ", " ", " ", "B"},
			                 {"B", "B", " ", " ", "B", " ", " ", "B", "B"},
			                 {"B", "B", " ", " ", "B", " ", " ", "B", "B"},
			                 {"B", " ", " ", " ", "B", " ", " ", " ", "B"},
			                 {"B", "B", " ", " ", " ", " ", " ", "B", "B"},
			                 {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
			                 {"B", " ", "B", " ", " ", " ", "B", " ", "B"}
 };

	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {

		Thread.sleep(1000);
		moveToQuadrant(6, 5);
		Thread.sleep(1000);
		moveToQuadrant(4, 4);
		Thread.sleep(1000);
		moveToQuadrant(10, 10);

	}

	// move to quadrant
	void moveToQuadrant(int v, int h) throws InterruptedException {

		int x = (v - 1) * 64;
		int y = (h - 1) * 64;

		if (tankX < x) {
			while (tankX != x) {
				move(4);
				painterTank();
			}

		} else {
			while (tankX != x) {
				move(3);
				painterTank();
			}
		}
		if (tankY < y) {
			while (tankY != y) {
				move(2);
				painterTank();
			}
		} else {
			while (tankY != y) {
				move(1);
				painterTank();
			}

		}

	}

	void painterTank() throws InterruptedException {
		Thread.sleep(10);
		repaint();

	}

	void turn(int direction) {
		tankDirection = direction;
	}

	/**
	 * direction /"1 up" /"2 down" /"3 left" /"4 right"
	 * 
	 * @param direction
	 * @throws InterruptedException 
	 */
	void move(int direction) {
		int step = 1;
		int covered = 0;

		if ((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0)
				|| (direction == 4 && tankX >= 512)) {
			System.out.println("[Illegal move] " + " tankX:" + tankX
					+ " tankY:" + tankY);

			return;
		}

		turn(direction);
		
        while(covered < 64 ){
			if (direction == 1) {
				tankY -= step;
				System.out.println("Direction UP " + direction + " tankX:"
						+ tankX + "tankY: " + tankY);
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
			
		 covered += 64;
		
		 
        }

	}

	// random move for tank
	/**
	 * static int moveRandom() { int randDir = (int)((Math.random() * 4) + 1);
	 * return randDir; }
	 */

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 592;
	final int BF_HEIGHT = 592;

	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
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