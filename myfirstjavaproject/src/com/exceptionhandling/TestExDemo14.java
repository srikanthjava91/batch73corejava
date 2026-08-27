package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo14 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter another number : ");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Babu chitti DOnt send zeros");
//			System.out.println();//Unreachable code
		}

		System.out.println("main method ended ");
	}
}
