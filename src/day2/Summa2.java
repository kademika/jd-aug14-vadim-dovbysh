package day2;

public class Summa2 {

	public static void main(String[] args) {
		
		double number = 2.3;
		
		System.out.println(square(number));
		System.out.println(square(number));
		System.out.println(square(22));
		
	}
	
	public static double square(double number)
	{
		number *= number;
		return number;
	}
	
	static double square(int number){
		number *= number;
		return number;
	}
	
}
