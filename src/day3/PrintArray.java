package day3;

public class PrintArray {

	public static void main(String[] args) {
		
		printArray(new int[]  {545, 54989, 65465, -95, 555});

	}

	static void printArray(int[] data) {
		int indx = 0;
		int lengthArray = data.length;
		if (data != null) {
			if (lengthArray > 0) {
				System.out.print("[");
				while (indx != lengthArray) {
					System.out.print(data[indx]);
					if (indx != lengthArray - 1) {
						System.out.print(", ");
					}
					indx++;
				}
				if (indx == lengthArray) {
					System.out.print("]");
				}

			}

		}

	}

}
