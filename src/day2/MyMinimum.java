package day2;

public class MyMinimum {
	public static void main(String[] args){
	
		
		System.out.println(min(4, 3, 5, 0));
		
	}
	public static int min(int a, int b, int c, int j)
	{	
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
	    if (j < min)
			min = j;
		return min;
	}

}
