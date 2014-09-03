package day3;

public class Factorial {

	public static void main(String[] args) {

		long m = factorial(10);
		System.out.println(m);

	}

	static long factorial(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f *= i;
			
		}

		return f;
	}
}
