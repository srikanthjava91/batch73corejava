package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo13 {

	public static void main(String[] args) {
		System.out.println("main method strated");

		char ch = ' ';

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a number : ");
			int a = sc.nextInt();

			System.out.println("Enter b number : ");
			int b = sc.nextInt();

			System.out.println("Enter a Symbol : ");
			char c = sc.next().charAt(0);

			int result = 0;

			switch (c) {

			case '+' -> result = a + b;
			case '-' -> result = a - b;
			case '*' -> result = a * b;
			case '/' -> result = a / b;
			case '%' -> result = a % b;
			default -> System.out.println("Invalid symbol : ");

			}

			System.out.println("Resulted value is : " + result);
			System.out.println("Do you want to Continue ..? Click y for Yes ,N for No");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		System.out.println("Exit");
		System.out.println("main method started !");

	}

}
