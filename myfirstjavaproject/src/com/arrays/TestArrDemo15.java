package com.arrays;

import java.util.Arrays;

public class TestArrDemo15 {

	public static void main(String[] args) {

		int[] arr = { 3, 3, 3, 2, 2, 2, 6, 5, 1, 4 };

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];// 1 is the value
			int j = i;// 1 index here

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}

			arr[j] = temp;

		}

		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

}
