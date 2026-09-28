package com.java8features;

@FunctionalInterface
interface In4 {
	int addition(int x, int y);
}

public class TestJ8Demo5 {

	public static void main(String[] args) {

		In4 i4 = (a, b) -> {
			return a + b;
		};
		System.out.println(i4.addition(10, 20));
	}
}
