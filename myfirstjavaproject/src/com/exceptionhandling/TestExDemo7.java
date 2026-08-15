package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("main mehod started ");
//		 Initiates the Runtime##shutdown

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		try {
			System.out.println("in try ");
			System.out.println(10 / a);
		} catch (Exception e) {
			System.out.println("in catch ");
			System.out.println(10/0);
		} finally {
			System.out.println("in finally  ");
			sc.close();
		}

		System.out.println("main method ended ");
	}

}
