package day3;

public class MethodArray {

	public static void main(String[] args) {

		int[] data = { 1, 10, 5, 7, 698, 8765};
		int[] data1 = null;
		System.out.println(getLast(data));
		System.out.println(getLast(data1));

	}

	static int getLast(int[] data) {
		int lastIndex = data[data.length - 1];
		if (lastIndex <= 0) {
			lastIndex = -1;
		}
		return lastIndex;
	}

}
