package day2;

public class MyMinimum2 {

	public static void main(String[] args) {
		
		System.out.println(min(842, 800, 15548));
		
		

	}
	
	public static int min(int a, int b, int c){
		int min;
		
		if( a < b && a < c )
			min = a;
		else if( b < a && b < c)
			min = b;
		else min = c;
		
		
		
		
		return min;
	}

}
