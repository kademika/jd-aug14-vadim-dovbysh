package day3;

import java.util.Arrays;
import java.util.Random;

public class createArray {

	public static void main(String[] args) {
		int[] data = createArray(10);
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		

	}
	
	static int[] createArray(int dimention){
		
		int[] array = new int[dimention];
		
		Random rand = new Random();
		
		int cValue = dimention;
		for (int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(dimention);
			cValue--;
		}
		
		return array;
		
	}
	

}
