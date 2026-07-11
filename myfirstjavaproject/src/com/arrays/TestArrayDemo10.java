package com.arrays;

public class TestArrayDemo10 {

	public static void main(String[] args) {

		String[][] names = new String[2][3];// 0 1 --> 0 1 2

		// 00 01 02
		// 10 11 12

		names[0][0] = "Abhishek Sharma";
		names[0][1] = "Rohit Sharma";
		names[0][2] = "Sanjay Samson";

		names[1][0] = "Tilak Varma ";
		names[1][1] = "Hardhik  Pandya";
		names[1][2] = "Virat Kohli";

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] +" || ");
			}
			System.out.println();
		}

//		for (String[] names1 : names) {
//			for (String name : names1) {
//				System.out.print(name +" | ");
//			}
//			System.out.println();
//		}

	}

}
