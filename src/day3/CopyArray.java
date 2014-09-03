package day3;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr1 = new int[7];
		int[] arr2 = {5, 8, 9, 3, 8};
		copyArray(arr2, 2, arr1, 3, 3 );
		System.out.print(Arrays.toString(arr1));

	}

	// src - источник
	// srcPos - позиция для первого элемента копирования
	// dest - массив для вставки данных
	// destPos - позиция с которой начинаем вставку
	// lenght - количество элементов для копирования

	static void copyArray(int[] src, int srcPos, int[] dest, int destPos, int length) {

		for (int i = 0; i < length; i++) {
			dest[destPos + i] = src[srcPos + i];
		}
	}
}
