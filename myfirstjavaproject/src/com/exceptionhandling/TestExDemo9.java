package com.exceptionhandling;

public class TestExDemo9 {

	static int hello() {

		try {
			System.out.println("in try");
			return 10;
		} catch (Exception e) {
			System.out.println("in catch");
			return 20;
		}finally {
			System.out.println("Hello");
		}

	}

	public static void main(String[] args) {
		System.out.println("in main mehod started ");

		System.out.println(hello());

		System.out.println("in main mehod ended");

	}

}
