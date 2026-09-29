package com.java8features;

interface In7 {
	int squareit(int n);
}

public class TestJ8Demo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		In7 i7 = n -> n * n;
		System.out.println(i7.squareit(9));
		System.out.println("main method ended ");
	}
}
