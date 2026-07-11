package com.arrays;

public class TestArrayDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] arr = new int[3][];// 0 1 2

		arr[0] = new int[3];// 0 1 2
		arr[1] = new int[1];// 0 1
		arr[2] = new int[3];// 0 1 2

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
