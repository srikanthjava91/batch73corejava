package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a value : ");
			int a = sc.nextInt();

			System.out.println("Ener b value : ");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (ArithmeticException mani) {
//			e.printStackTrace();
			System.err.println(mani);
			System.err.println(mani.toString());
//			System.err.println(e.getMessage());
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");

	}

}
