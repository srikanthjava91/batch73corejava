package com.arrays;

// WAP to find min & max elements from a GIven Array ..? 
public class TestArrayDemo6 {

	public static void main(String[] args) {

		int[] marks = { 65, 66, 67, 62, 53, 60 };

		int min = marks[0];// 65 62 53
		int max = marks[0];

		for (int i = 1; i < marks.length; i++) {

			if (marks[i] < min) {
				min = marks[i];
			} else if (marks[i] > max) {
				max = marks[i];
			}

		}

		System.out.println("min value is : " + min);
		System.out.println("Max value is : " + max);

	}

}
