package day4Tanks;

public class Tank {

	protected int speed = 10;
	private int x;
	private int y;
	private Direction direction;

	private BattleField bf;
	private ActionField af;

	public Tank(ActionField af, BattleField bf) {
		this(af, bf, 128, 512, Direction.UP);
	}

	public Tank(ActionField af, BattleField bf, int x, int y,
			Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		;
		this.y = y;
		this.direction = direction;
	}

	void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);
	}

	public void move() throws Exception {
		af.processMove(this);
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((x + 25), (y + 25), direction);
		af.processFire(bullet);
	}

	public void moveToQuadrant(int v, int h) {

	}

	public void moveRandom() {

	}

	public void clean() throws Exception {

	}

	public void destroy() {
		x = -100;
		y = -100;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public int getSpeed() {
		return speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}
}
