package com.arrays;

import java.util.Arrays;

public class TestArrayDemo8 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int[] a = { 10, 20, 30, 100, 200, 300 };
		int[] b = { 40, 50, 60, 400 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println("Repreenting an array ");
		System.out.println(Arrays.toString(c));

	}

}
