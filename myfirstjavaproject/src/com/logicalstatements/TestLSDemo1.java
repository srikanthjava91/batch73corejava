package com.logicalstatements;

//WAP to Check age Eligibility For Voting & Driving ..? 
import java.util.Scanner;

public class TestLSDemo1 {

	void main() {
		System.out.println("main method Started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 21

		if (age > 18) {
			System.out.println("You are eligible for Voting & Driving !");
			System.out.println("Hello");
		} else 
			System.out.println("Arey babu, Niku inka time undi ra !!");
			System.out.println("Welcome ");
		

		
		System.out.println("main method ended ");

	}

}
