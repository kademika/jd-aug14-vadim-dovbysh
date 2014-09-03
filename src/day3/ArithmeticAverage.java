package day3;

public class ArithmeticAverage {

	public static void main(String[] args) {

		int[] data = { 1, 2, 5, 6 };
		System.out.println(average(data));
	}

	static double average(int[] data) {
		double sum = 0;
		if (data != null || data.length != 0) {
			for (int i : data) {
				sum += i;
			}
			return sum / data.length;
		} else {
			return -1;
		}

	}
}
