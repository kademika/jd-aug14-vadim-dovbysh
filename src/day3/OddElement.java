package day3;

public class OddElement {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(oddElementSum(data));
	}

	static long oddElementSum(int[] data) {

		long sum = 0;
		if (data != null) {
			for (int i = 0; i < data.length; i++) {

				if (i % 2 != 0) {

					System.out.println(data[i]);
					sum += data[i];
				}
			}
		}
		return sum;

	}
}
