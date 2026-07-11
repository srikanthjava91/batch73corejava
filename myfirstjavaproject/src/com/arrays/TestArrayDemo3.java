package com.arrays;

public class TestArrayDemo3 {

	public static void main(String[] args) {

		String[] names = new String[300];// 0 1 2 3 .... 499

		names[0] = "Srikanth";
		names[1] = "Java";
		names[2] = "Vcube";
		names[3] = "JNTU";
		names[4] = "Hyderabad";

//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + " ");
//		}

		for (String name : names) {
			System.out.print(name + " ");
		}

	}

}
