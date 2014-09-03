package day2;

public class MyOldEnough {
	public static void main(String[] args){
		int age = 2;
		System.out.println(oldEnough(age));
		System.out.println(oldEnough(56));
		
		
		
	}
	
	public static boolean oldEnough(int age)
	{
		
		if(age >= 21){
			
			return true;
		}
		
		return false;
	}

}
