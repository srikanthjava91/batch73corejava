package com.logicalstatements;

import java.util.Scanner;

//WAP to print Calculation Based on Given numbers & Arithmetic Operators ..? 
public class TestLSDemo8 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		do {
			System.out.println("Enter a number ");
			int a = sc.nextInt();

			System.out.println("Enter another number ");
			int a1 = sc.nextInt();

			System.out.println("Enter a Symbol : ");
			String symb = sc.next();

			double result = 0;

			switch (symb) {

			case "+" -> result = a + a1;
			case "-" -> result = a - a1;
			case "*" -> result = a * a1;
			case "%" -> result = a % a1;
			case "/" -> result = a / a1;
			default -> System.out.println("Invalid Symbol ");

			}

			System.out.println("The Resulted value is  : " + result);
			System.out.println("Do you want to Continue ..? CLick Y for Yes or N for NO");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("y"));

		
		System.out.println("EXIT !!");
		System.out.println("main method ended !");
	}
	
	

}
