package com.logicalstatements;

import java.util.Scanner;

//WAP to print Week day based on Given number ..? 
//1 --> Sunday --> 6 Friday -> 7 Saturday 
public class TestLSdemo7 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		switch (num) {
		case 1 -> {
			System.out.println("Sunday");
			System.out.println("Sundays are alway Happy Days !!");
		}
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invalid entry ");
		}

	}

}
