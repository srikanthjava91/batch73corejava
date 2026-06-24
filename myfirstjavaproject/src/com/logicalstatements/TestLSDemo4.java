package com.logicalstatements;

import java.util.Scanner;

//WAP to Print the Grade based on Marks Percentage ..? 
public class TestLSDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks Percentage : ");
		double marksP = sc.nextDouble();// 65

		if (marksP > 100 || marksP < 0) {
			System.out.println("Invalid Marks Percentage !");
		} else if (marksP >= 35) {
			System.out.println("Just Passed ");
		} else if (marksP >= 90) {
			System.out.println("Grade A");
		} else if (marksP >= 80) {
			System.out.println("Grade B");
		} else if (marksP >= 70) {
			System.out.println("Grade C");
		} else if (marksP >= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Failed ");
		}

	}

}
