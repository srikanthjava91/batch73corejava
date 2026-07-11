package com.arrays;

public class TestArrayDemo2 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		numbers[1] = 10;
		numbers[2] = 20;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

//		for (int n : numbers) {
//			System.out.print(n + " ");
//		}

	}

}
