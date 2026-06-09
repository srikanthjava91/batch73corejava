package com.langfunda.methods;

import java.util.Scanner;

//150 methods 
//WAP To find Total Salary with Salary + Bonus + GST as different methods 
public class TypesOfMethodDemo3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started ");

		TypesOfMethodDemo3 t = new TypesOfMethodDemo3();
//		double salary = t.getSalaryInfo();
//		double bonus = t.getBonusInfo();
//		double gstAmount = t.getGST();

		System.out.println("Total Salary is : " + (t.getSalaryInfo() + t.getBonusInfo() + t.getGST()));
		System.out.println("main method ended ");
	}

	double getSalaryInfo() {
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		return sal;
	}

	double getBonusInfo() {
		System.out.println("Enter Bonus : ");
		double bonus = sc.nextDouble();
		return bonus;
	}

	double getGST() {
		System.out.println("Enter GST amount  : ");
		double gst = sc.nextDouble();
		return gst;
	}

}
