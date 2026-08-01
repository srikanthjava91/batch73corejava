package com.dsa;

public class TwoPointersDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 3, 4, 5, 6, 7, 10, 12, 15 };
		int target = 15;
		boolean status = false;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int sum = arr[start] + arr[end];

			if (sum == target) {
				System.out.println("Pair is found : ");
				System.out.println(start + " " + end);
				start++;
				end--;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}

	}

}
