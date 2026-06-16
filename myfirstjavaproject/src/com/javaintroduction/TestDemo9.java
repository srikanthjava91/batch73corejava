package com.javaintroduction;

public class TestDemo9 {

	public static void main(String[] args) {

		try {
			System.out.println("Hello try");
			System.out.println(10/0);
		} catch (Exception e) {
			System.err.println("Hello catch");
		}
	}

}
