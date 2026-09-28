package com.java8features;

@FunctionalInterface
interface In2 {
	void addition(int a, int b);

	default void welcome() {
		System.out.println("Welcome method called From In2!!");
	}
}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Lambda Expression
		In2 t2 = (x, y) -> System.out.println("sum is : " + (x + y));

		t2.addition(10, 100);
		t2.welcome();

		System.out.println("main method ended ");

	}

}
