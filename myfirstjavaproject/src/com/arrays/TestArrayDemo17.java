package com.arrays;

import java.util.Arrays;

public class TestArrayDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		int[] arr = { 6, 5, 4, 3};

		divide(arr);

		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

	static void divide(int[] arr) {

		if (arr.length <= 1) {
			return;
		}

		int[] left = new int[arr.length / 2];// 0 0
		int[] right = new int[arr.length - left.length];// 0 0

		int i;

		// Copying the elements from given array to left array
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		// Copying the elements from given array to right Array
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}

		divide(left);
		System.out.println("left values  : " + Arrays.toString(left));

		divide(right);
		System.out.println("right values  : " + Arrays.toString(right));

		merge(arr, left, right);

	}

	static void merge(int[] arr, int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		while (i < left.length) {
			arr[k++] = left[i++];
		}

		while (j < right.length) {
			arr[k++] = right[j++];
		}

	}

}
