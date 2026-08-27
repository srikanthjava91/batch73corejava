package com.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class TestExDemo15 {

	static void show() throws IOException {
		System.out.println("Show method called ");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		show();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age  ");

		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are Eligible for Voting & Driving ");
		} else {
			throw new SiddikException("Babu SIddik Niku time undi ra ");
		}
	}
}
