package com.arrays;

public class TestArrayDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[][] arr = new int[3][3];// 0 1 2 ---> 0 1 2

		arr[0][0] = 10;
		arr[1][1] = 100;
		arr[2][2] = 1000;

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

//		for (int[] arr1 : arr) {
//			for (int a : arr1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

	}
}
