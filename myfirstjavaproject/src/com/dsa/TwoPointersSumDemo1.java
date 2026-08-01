package com.dsa;

//Brute-Force Methodology 
public class TwoPointersSumDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 3, 4, 5, 6, 7, 10, 12, 15 };
		int target = 15;
		boolean status = false;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(i + " " + j);
					status = true;
				}
			}

			if (status) {
				break;
			}
		}

	}

}
