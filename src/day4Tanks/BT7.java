package day4Tanks;

public class BT7 extends Tank {

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);
		speed = 5;
	}

	public BT7(ActionField af, BattleField bf, int x, int y, Direction direction) {
		super(af, bf, x, y, direction);
		speed = 5;
	}

}
