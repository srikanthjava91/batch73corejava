package com.arrays;

public class TestArrayDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[][][] arr = { { {10,20,30}, {40,50}, {60,70} }, 
						  { {1,2,3}, {4,5,6} }, 
						  { {11,12,13}, {14,15} } };

		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int a : arr1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
//		System.out.println(arr);
	}

}
