package com.arrays;

import java.util.Arrays;

//WAP to print 5 ages using Arrays ..? 
public class TestArrayDemo1 {

	public static void main(String[] args) {

		// Declaration
		int[] ages;

		// Creation
		ages = new int[5]; // n=5 index = 0 1 2 3 4

		// Initialization
		ages[0] = 22;
		ages[1] = 23;
		ages[2] = 24;
		ages[3] = 25;
		ages[4] = 22;

		// Representation with for loop
//		for (int i = 0; i < ages.length; i++) {
//			System.out.print(ages[i] + " ");
//		}

		// Representation with enhanced for loop or for each loop
//		for (int age : ages) {
//			System.out.print(age + " ");
//		}

		System.out.println(Arrays.toString(ages));

	}

}
