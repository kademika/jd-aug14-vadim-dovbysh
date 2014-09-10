package day5_tanks_inharitance;

public class Tank {

	private int crew;
	private String color;
	private int maxSpeed;

	public Tank() {

	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void printTankInfo(){
		System.out.print("Crew " + getCrew() + " ");
		System.out.print("Color " + getColor() + " ");
		System.out.println("Max Speed " + getMaxSpeed());
		
	}
	
	public String move(){
		
		return "Moved to quadrant";
		
	}
	
	
	
	
}
