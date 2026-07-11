package com.arrays;

import java.util.Arrays;

public class TestArrayDemo13 {

	public static void main(String[] args) {

		int[] arr = {20,10, 5,4, 50, 2};
		int count = 0;
		int count1 = 0;

		System.out.println("Before Sort : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				count1++;
			}
			if (!swapped) {
				break;
			}
		}

		System.out.println(count);
		System.out.println(count1);

		System.out.println("After Sort : " + Arrays.toString(arr));

	}

}
