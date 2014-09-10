package day5_tanks_inharitance;

public class T34 extends Tank {
public String move(){
		
		return "T34 Moved to quadrant";
		
	}

    public String toString(){
    	
    	return getColor() + " " + getCrew() + " " + getMaxSpeed(); 
    	
    }
}