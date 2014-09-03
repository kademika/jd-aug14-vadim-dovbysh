package day2;

public class MySpring {

	public static void main(String[] args) {
		
		System.out.println(isSpring(1));
		System.out.println(isSpring(4));
		System.out.println(isSpring(16));
		System.out.println(isSpring(-1));
		
	}
	
	public static int isSpring (int month)
	{
		if(month >= 3 && month <= 5){
			System.out.println("Весна");
		  return 1;
		}
		
	   else if (month >= 1 && month <= 12)
	   {
		   System.out.println("Не  весна");
		   return 0;
	   }
		System.out.println("Не месяц");
	    return -1;
		
	}

}