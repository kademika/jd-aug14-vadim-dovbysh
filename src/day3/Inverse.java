package day3;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {

		String str = "123456";
		System.out.print(inverse(str));
	}

	static String inverse(String str) {
		
		if (str != null || str.isEmpty()) {
			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length / 2; i++) {
				char tmp = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = arr[i];
				arr[i] = tmp;
			}
			String srtInv = new String(arr);
			return srtInv;
		}
		return null;
	}

}
