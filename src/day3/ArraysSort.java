package day3;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] data = { -2, 5, 3, 4, 1, 8, -6, 74 };
		sort(data);
		System.out.print(Arrays.toString(data));

	}

	static void sort(int[] data) {
		int temp; 	
		if (data != null) {
			for(int x = 0; x < data.length - 1; x++) {
				for (int i = 0; i < data.length - 1; i++) {
					if (data[i] > data[i + 1]) {
						temp = data[i];
						data[i] = data[i + 1];
						data[i + 1] = temp;
					}
				} 
			}
		}
	}
}
