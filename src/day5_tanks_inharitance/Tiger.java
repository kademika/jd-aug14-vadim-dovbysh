package day5_tanks_inharitance;

public class Tiger extends Tank {
public String move() {
		
		return "Tiger Moved to quadrant ";
		
	}

public String toString(){
	
	return getColor() + " " + getCrew() + " " + getMaxSpeed(); 
	
}

}
