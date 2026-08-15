package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try!");
			System.out.println("Narendra");
			System.out.println("Sangeetha");

			int a = 10 / 1;
			String str = "Abhishek";
			System.out.println(str.charAt(a));

		} catch (ArithmeticException | StringIndexOutOfBoundsException e) {
			System.err.println("in catch of AE!");
		} catch (Exception e) {
			System.err.println("in catch of E!");
		}

		System.out.println("Bhanu");
		System.out.println("Shiva");
		System.out.println("main method ended ");
	}

}
