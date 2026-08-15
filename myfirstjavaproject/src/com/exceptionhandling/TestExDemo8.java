package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try ");

//			System.out.println(0 / 0);// AE
//			System.out.println(0.0 / 0.0);// NaN
//			System.out.println(0 / 0.0);// NaN
			System.out.println(5 / 0.0);// Infinity

		} catch (Exception e) {
			System.out.println("in catch !!");
			e.printStackTrace();
		} finally {
			System.out.println("in finally ");
		}

		System.out.println("main method ended ");

	}

}
