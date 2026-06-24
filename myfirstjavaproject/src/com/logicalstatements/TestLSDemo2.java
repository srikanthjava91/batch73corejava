package com.logicalstatements;

//WAP to print whether the Given number even or add & Positive or Negative ..? 
import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int number = sc.nextInt();// 10

		//The Given number is Positive or not ..>
		if (number >= 0) {
			System.out.println("Number is Positive : " + number);
		} else {
			System.out.println("Number is Negative : " + number);
		}

		//WAP to print The Given number is Even or odd 
		if (number % 2 == 0) {
			System.out.println("Number is Even ");
		} else {
			System.out.println("Number is Odd ");
		}

	}

}
