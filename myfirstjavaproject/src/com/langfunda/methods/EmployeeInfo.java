package com.langfunda.methods;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Organization !!");

		EmployeeInfo e = new EmployeeInfo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a age : ");
		int age = sc.nextInt();// InputMisMatchException

		System.out.println("Enter a Organization name : ");
		sc.nextLine();
		String orgname = sc.nextLine();
		e.getOrgName(orgname);// Call by values

		System.out.println("Enter your Full Name ");
		String fullName = sc.nextLine();
		e.getFullName(fullName);

		System.out.println("Enter your Height ");
		float height = sc.nextFloat();

		System.out.println("Enter your weight : ");
		double weight = sc.nextDouble();

		e.heightAndWeightInfo(height, weight);

		System.out.println("Enter your Gender info : ");
		char gen = sc.next().charAt(0);// Method Chaining
		e.getGenderInfo(gen);

		System.out.println("main method ended !");

	}

	void getGenderInfo(char c) {
		System.out.println("Gender Info " + c);
	}

	void heightAndWeightInfo(float h, double w) {
		System.out.println("Enployee Height is : " + h);
		System.out.println("Employee Weight is : " + w);
	}

	void getFullName(String name) {
		System.out.println("Name of the Employee :" + name);
	}

	void getAge(int age) {
		System.out.println("Age  is :" + age);
	}

	void getOrgName(String orgName) {
		System.out.println("Organization name is : " + orgName);
	}

	void getEmpSalInfo(double sal) {
		System.out.println("Employee Salary is : " + sal);
	}

	void getEmpCurrentCity(String city) {
		System.out.println("Current City is : " + city);
	}
}
