package com.oops.inheritance;

import java.util.Scanner;

//Parent / Super / Base class 
public class Loan {
	static Scanner sc = new Scanner(System.in);

	String hello() {
		return "loan";
	}

	String getCustomerName() {
		sc.nextLine();
		System.out.println("Enter your name ");
		String name = sc.nextLine();
		return name;
	}

	int getCustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	double getCustomerSalaryInfo() {
		System.out.println("ENter your salary : ");
		double sal = sc.nextDouble();
		return sal;
	}

	int cibilInfo() {
		System.out.println("Enter Cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	private int add() {
		return 2;
	}

	Number getROI() {
		double roi = 12.0;
		return roi;
	}

//	double getROI() {
//
//		int cibil = cibilInfo();
//		double roi = 12.0;
//
//		if (cibil >= 300 && cibil < 550) {
//			System.out.println("Poor – high risk for lenders");
//			return roi + 1.0;
//		} else if (cibil >= 550 && cibil < 650) {
//			System.out.println("Average – credit may be approved with difficulty");
//			return roi;
//		} else if (cibil >= 650 && cibil < 750) {
//			System.out.println("Good – acceptable to many lenders");
//			return roi - 2.0;
//		} else if (cibil >= 750 && cibil <= 900) {
//			System.out.println("Excellent – high approval chances and better interest rates");
//			return roi - 4.0;
//		} else {
//			System.out.println("Invalid Cibil score : ");
//			return roi;
//		}
//
//	}

	boolean isValidPhone() {
		System.out.println("Enter your Phone : ");
		String phone = sc.next();
		boolean isValid = phone.matches("^[6-9][0-9]{9}");
		return isValid;
	}

	boolean isAadharValid() {
		System.out.println("Enter your Aadhar : ");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("^[2-9][0-9]{11}");
		return isAadharValid;
	}

	// ABCDE1234H
	boolean isPanValid() {
		System.out.println("ENter you PAN deatils : ");
		String pan = sc.next();
		boolean isPanValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isPanValid;
	}

}
