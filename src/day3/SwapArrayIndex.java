package  day3;

import java.util.Arrays;

public class SwapArrayIndex {

	public static void main(String[] args) {

		int[] data = {};
		System.out.println("Before " + Arrays.toString(data));
		
		swap(data, 0, 2);

		System.out.println("After  " + Arrays.toString(data));

	}

	static void swap(int[] data, int i, int k) {
		if ((i > data.length || i < 0)|| (k > data.length || k < 0) || data == null || i == k) {
			System.out.println("Вы ввели неправильное значение, ничего не произошло.");		
		    return;
		}
		int temp = data[i];
		data[i] = data[k];
		data[k] = temp;

	}

}
