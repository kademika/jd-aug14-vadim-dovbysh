package day4Tanks;

import javax.swing.JPanel;

class BattleField extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int bfWidth = 576;
	public final int bfHeight = 576;

	public String[][] battleField = {
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" },
			{ " ", " ", " ", " ", " ", " ", " ", " ", " " },
			{ "B", "B", " ", "B", " ", "B", " ", "B", "B" },
			{ " ", " ", " ", " ", " ", " ", " ", " ", " " },
			{ "B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{ "B", "B", " ", " ", " ", " ", " ", "B", "B" },
			{ " ", " ", " ", " ", "B", " ", " ", " ", " " },
			{ " ", "B", " ", " ", " ", " ", " ", "B", " " },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" } };

	public BattleField() {

	}

	public BattleField(String[][] battleField) {
		this.battleField = battleField;
	}

	public String scanQuadrant(int v, int h) {
		return battleField[v][h];
	}

	public void updateQuadrant(int v, int h, String object) {

		battleField[v][h] = object;

	}

	public int getDimentionX() {
		return battleField.length;
	}

	public int getDimentionY() {
		return battleField.length;
	}

	public int getBfWidth() {
		return bfWidth;
	}

	public int getBfHeight() {
		return bfHeight;
	}
}
