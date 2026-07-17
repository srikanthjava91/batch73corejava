package com.arrays;

public class TestArrayDemo18 {

	public static void main(String[] args) {

		int[][][] arr = new int[3][3][3];

		arr[0][0][0] = 1;
		arr[0][0][1] = 2;
		arr[0][0][2] = 3;

		arr[0][1][0] = 4;
		arr[0][1][1] = 5;
		arr[0][1][2] = 6;

		arr[0][2][0] = 7;
		arr[0][2][1] = 8;
		arr[0][2][2] = 9;

		arr[1][1][1] = 100;

		arr[2][2][2] = 200;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

//		for (int[][] arr2 : arr) {
//			for (int[] arr1 : arr2) {
//				for (int a : arr1) {
//					System.out.print(a + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

	}

}
