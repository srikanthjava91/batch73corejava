package com.operators;

import java.util.Scanner;

//8) Ternary Operators --> 15+ 
//? :
//Syntax : (condition)?(Statement1):(statement2);
public class TestTernaryOpDemo8 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		// Find max from Given numbers.
		int a = 100;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max value from Given numbers: " + max);

//		Check Age Eligibility For Driving..? 
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		String eligibility = (age > 18) ? "Yes" : "NO";
		System.out.println("Is this Person Eligible for Driving ..? " + eligibility);

		int a1 = 10;
		int b1 = 30;
		int c1 = 40;

		int max1 = (a1 > b1) ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1);
		System.out.println("Max value from Given numbers: " + max1);

	}

}
