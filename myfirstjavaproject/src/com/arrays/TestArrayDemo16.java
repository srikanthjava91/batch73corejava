package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to Rotate an Array by 'r' positions using Reversal Algorithm
 *
 * Example:
 * Input  : [1,2,3,4,5,6,7,8]
 * Rotate : 4
 * Output : [5,6,7,8,1,2,3,4]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Explanation:
 * 1. Reverse the entire array.
 * 2. Reverse the first 'r' elements.
 * 3. Reverse the remaining elements.
 */

public class TestArrayDemo16 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many times you want to rotate:");
		int r = sc.nextInt();

		rotateArray(arr, r);

		System.out.println("After Rotation : " + Arrays.toString(arr));

		sc.close();
	}

	/*
	 * Time Complexity:
	 *
	 * reverseArray() -> O(n) reverseArray() -> O(r) reverseArray() -> O(n-r)
	 *
	 * Total: O(n) + O(r) + O(n-r) = O(2n) = O(n)
	 *
	 * Space Complexity: O(1)
	 */

	private static void rotateArray(int[] arr, int r) {

		r = r % arr.length;

		int start = 0;
		int end = arr.length - 1;

		// Step 1: Reverse entire array
		// 1 2 3 4 5 6 7 8
		// 8 7 6 5 4 3 2 1
		reverseArray(arr, start, end);

		// Step 2: Reverse first r elements
		// 8 7 6 5 4 3 2 1
		// 5 6 7 8 4 3 2 1
		reverseArray(arr, start, r - 1);

		// Step 3: Reverse remaining elements
		// 5 6 7 8 4 3 2 1
		// 5 6 7 8 1 2 3 4
		reverseArray(arr, r, end);

	}

	/*
	 * Reverse Array
	 *
	 * Time Complexity: O(end - start + 1)
	 *
	 * Worst Case: O(n)
	 *
	 * Space Complexity: O(1)
	 */

	private static void reverseArray(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

	}

}