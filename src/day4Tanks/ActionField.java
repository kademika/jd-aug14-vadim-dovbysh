package day4Tanks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import day3.BattleFieldTemplate2;

public class ActionField extends JPanel {

	final boolean COLORDED_MODE = false;
	private BattleField battleField;
	private Tank tank;
	private BT7 bt7;
	private Bullet bullet;

	void runTheGame() throws Exception {
//		bt7.move();
//		bt7.fire();
		
		tank.fire();
		// Thread.sleep(1000);
		tank.move();
		// Thread.sleep(1000);
		tank.move();
		tank.move();
		// Thread.sleep(1000);
		tank.fire();
		tank.move();
		tank.move();
		// Thread.sleep(1000);
		tank.fire();
		tank.move();

	}

	public void processTurn(Tank tank) throws Exception {
		repaint();
	}

	public void processMove(Tank tank) throws Exception {
		this.tank = tank;
		Direction direction = tank.getDirection();
		int step = 1;
		int covered = 0;

		// check limits x 0 513 y 0 513

		if ((direction == Direction.UP && tank.getY() == 0)
				|| (direction == Direction.DOWN && tank.getY() >= 512)
				|| (direction == Direction.LEFT && tank.getX() == 0)
				|| (direction == Direction.RIGHT && tank.getX() >= 512)) {
			System.out.println("[Illegal move] direction " + direction
					+ " tankX: " + tank.getX() + " tankY: " + tank.getY());
			return;
		}
		tank.turn(direction);

		while (covered < 64) {
			if (direction == Direction.UP) {
				tank.updateY(-step);
				System.out.println("Move Up direction " + direction
						+ " tank X " + tank.getX() + " tank Y " + tank.getY());
			} else if (direction == Direction.DOWN) {
				tank.updateY(step);
				System.out.println("Move Up direction " + direction
						+ " tank X " + tank.getX() + " tank Y " + tank.getY());
			} else if (direction == Direction.LEFT) {
				tank.updateX(-step);
				System.out.println("Move Up direction " + direction
						+ " tank X " + tank.getX() + " tank Y " + tank.getY());
			} else if (direction == Direction.RIGHT) {
				tank.updateX(step);
				System.out.println("Move Up direction " + direction
						+ " tank X " + tank.getX() + " tank Y " + tank.getY());
			}
			covered += step;
			repaint();
			Thread.sleep(tank.getSpeed());

		}
	}

	public void processFire(Bullet bullet) throws Exception {
		this.bullet = bullet;
		int step = 1;
		while ((bullet.getX() > -14 && bullet.getX() < 590)
				&& (bullet.getY() > -14 && bullet.getY() < 590)) {
			if (bullet.getDirection() == Direction.UP) {
				bullet.updateY(-step);
			} else if (bullet.getDirection() == Direction.DOWN) {
				bullet.updateY(step);
			} else if (bullet.getDirection() == Direction.LEFT) {
				bullet.updateX(-step);
			} else if (bullet.getDirection() == Direction.RIGHT) {
				bullet.updateX(step);
			}
			if (processInterseption()) {
				bullet.destroy();
			}
			repaint();
			Thread.sleep(bullet.getSpeed());
		}

	}

	// взаимодействие с препятствием(моменял Y X местами)
	private boolean processInterseption() {
		String coord = getQuadrant(bullet.getY(), bullet.getX());
		int y = Integer.parseInt(coord.split("_")[0]);
		int x = Integer.parseInt(coord.split("_")[1]);
		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			if (!battleField.scanQuadrant(y, x).trim().isEmpty()) {
				battleField.updateQuadrant(y, x, " ");
				return true;
			}
		}
		return false;
	}

	public String getQuadrant(int v, int h) {
		return v / 64 + "_" + h / 64;
	}

	public String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	public ActionField() throws Exception {

		battleField = new BattleField();
		tank = new Tank(this, battleField);
		bullet = new Bullet(-100, -100, Direction.NONE);

		//bt7 = new BT7(this, battleField, 128, 128, Direction.RIGHT);

		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth() + 12,
				battleField.getBfHeight() + 38));
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

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j, k).equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}

		g.setColor(new Color(255, 0, 0));
		g.fillRect(tank.getX(), tank.getY(), 64, 64);

		g.setColor(new Color(0, 255, 0));
		if (tank.getDirection() == Direction.UP) {
			g.fillRect(tank.getX() + 20, tank.getY(), 24, 34);
		} else if (tank.getDirection() == Direction.DOWN) {
			g.fillRect(tank.getX() + 20, tank.getY() + 30, 24, 34);
		} else if (tank.getDirection() == Direction.LEFT) {
			g.fillRect(tank.getX(), tank.getY() + 20, 34, 24);
		} else {
			g.fillRect(tank.getX() + 30, tank.getY() + 20, 34, 24);
		}

		g.setColor(new Color(255, 255, 0));
		g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
	}

}
