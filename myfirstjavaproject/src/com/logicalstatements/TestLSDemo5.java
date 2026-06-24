package com.logicalstatements;

import java.util.Scanner;

//WAP to work basic Validation Matrimonial check ..?
//nested if else 
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Full Name : ");
		String name = sc.nextLine();

		System.out.println("Nice to Meet you mr : " + name);

		System.out.println("Tell me about your Assets & Current Package : ");

		double assets = sc.nextDouble();
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 || salary >= 2500000.00) {
			System.out.println("Okay !! Good to go ");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age <= 28 && age >= 26) {
				System.out.println("Oh Okay nice to meet !!");

				System.out.println("Enter you Height ");
				float height = sc.nextFloat();

				if (height >= 5.6 && height <= 6.0) {
					System.out.println("Okay to Proceed !!");

					System.out.println("Enter your Weight : ");
					double weight = sc.nextDouble();

					if (weight >= 65 && weight <= 70) {
						System.out.println("Hmmm okay to finalize !!");

						System.out.println("Do you have Siblings ?");
						boolean sibStatus = sc.nextBoolean();

						if (!sibStatus) {
							System.out.println("Will Proceed and meet for the Next Discussion ");
						} else {
							System.out.println("OMG");
						}

					} else {
						System.out.println("You must need to join Gym, After reduced weight we can connect");
					}

				} else {
					System.out.println("You are too short or toolong, not matching your profile ");
				}

			} else {
				System.out.println("Your age not matching with our profile !");
			}

		} else {
			System.out.println("You can Leave for the day !");
		}

	}

}
