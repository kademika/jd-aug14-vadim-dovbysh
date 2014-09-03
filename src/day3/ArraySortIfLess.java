package day3;

import java.util.Arrays;

public class ArraySortIfLess {

	public static void main(String[] args) {
		int[] data = { -65, 5, 54, 65, 6541, -855 };
		sort(data);
		System.out.println(Arrays.toString(data));
	}

	static void sort(int[] data) {
		int temp;
		if (data != null) {
			for (int x = 0; x < data.length - 1; x++) {
				for (int i = 0; i < data.length - 1; i++) {
					if (data[i] < data[i + 1]) {
						temp = data[i];
						data[i] = data[i + 1];
						data[i + 1] = temp;
					}
				}
			}
		}
	}
}
