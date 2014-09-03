package day3;

import java.util.Arrays;

public class Union {

	public static void main(String[] args) {
		int[] data1 = { 1, 2, 3, 4};
		int[] data2 = { 3, 2, 1, 5 };
		int[] arrayUnion = union(data1, data2);
		System.out.println(Arrays.toString(arrayUnion));

	}

	static int[] union(int[] data1, int[] data2) {
		int[] data3 = new int[data1.length + data2.length];
		int i = 0;
		for (; i < data1.length; i++) {
			data3[i] = data1[i];
		}
		for (int j = 0; j < data2.length; j++) {
			data3[i++] = data2[j];
		}
		return data3;
	}

}
