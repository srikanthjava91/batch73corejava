package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Cricketer Description based on Jersey number.? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey number : ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Mahendra Sing Dhoni");
			System.out.println("Right hand Batsman + Wicket Keeping + Cool Captain");
			break;

		case 45:
			System.out.println("Rohith Sharma");
			System.out.println("After Dhoni, He is again a good captan + Hit man ");
			break;

		case 18:
			System.out.println("Virat Kohli");
			System.out.println("Run machine !! King kohli ");
			break;
			
		default : 
			System.out.println("Entered Jno is not playing today !");

		}

	}

}
