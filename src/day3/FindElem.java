package day3;

import java.util.Arrays;
import java.util.Random;

public class FindElem {

	public static void main(String[] args) {

		double[] numbers = createArray(20);
		System.out.println(Arrays.toString(numbers));

		int findEl = findElement(numbers, 4.0);
		System.out.print(findEl);

	}

	// ищем в массиве позицию элемента

	static int findElement(double[] numbers, double el) {
		if (numbers != null) {

			for (int i = 0; i < numbers.length; i++) {
				if ( numbers[i] == el) {
					return i;
				}
			}
		}
		return -1;
	}

	// создаем массив

	static double[] createArray(int size) {
		double[] numbers = new double[size];
		for (int i = 0; i < size; i++) {
			Random r = new Random();
			double rand = r.nextInt(10);
			numbers[i] = rand;
		}
		return numbers;
	}
}
