package day4;

import com.sun.corba.se.impl.protocol.SpecialMethod;

public class Car {

	private int wheels;
	private int passenger;
	private Car engine;
	private String name;
	private int boxGear;
	private int power;
	private int maxSpeed;
	private int speed;
	private int lenght;
	private int width;
	private int weight;

	boolean isMoving;
	private Colors color;
	
	public Car() {
		isMoving = false;
		color = Colors.DARK_BROWN;
		power = 100;
		name = "Honda";
	    passenger = 2;
	    maxSpeed = 200;
	}

	public void runCar() {
		System.out.println("Машина поехала");
	}

	public boolean isWoundMotor() {
		return isMoving = true;
	}

	public void increaceSpeed() {
		speed += speed;

	}

	public void decreaceSpeed() {
		speed -= speed;

	}

	public void startEngine() {
		System.out.println("Машина остановилась");
	}

	public void stopEngine() {
		System.out.println("Выключили двигатель");
	}

	public void damagedCar() {
		System.out.println("Машина получила повреждение");
	}
	
	public String getName(){
		return name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public boolean isMoving(){
		return isMoving;
	}

}
