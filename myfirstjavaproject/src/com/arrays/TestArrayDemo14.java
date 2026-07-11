package com.arrays;

import java.util.Arrays;

public class TestArrayDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 20, 10, 5, 4, 50, 2 };

		System.out.println("Before Sort : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 0 1 2 3 5

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		System.out.println("After Sort : " + Arrays.toString(arr));

	}

}
