package day5_tanks_inharitance;

public class BT7 extends Tank {

	public String move() {

		return "BT7 Moved to quadrant";

	}

	 public String toString(){
	    	
	    	return getColor() + " " + getCrew() + " " + getMaxSpeed(); 
	    	
	    }

}
