package com.langfunda.methods;

//WAP to print Calculation for addition subtraction multiplication division & modulus.
//Arithmetic Operators : + - * / % 
//addition(+) 				--> sum 	--> 100+900 -> 1000
//subtraction(-) 			--> diff 	--> 100-10 --> 90 
//multiplication(*) 		--> product  --> 10*10 --> 100 
// division(/) 				--> quotient --> 98/4 --> 24
// modulus (%) 				--> reminder --> 98%4 --> 2 
//methods with no arguments + no return type 
//BODMAS 
public class TypesOfMethodsDemo2 {

	void addition() {
		int a = 10;
		int b = 98;
//		String + anything is String only 
//		Concatenation 
		System.out.println("Addition of Two numbers is : " + a + b);// 1098
		System.out.println("Addition of Two numbers is : " + (a + b) + 10);// 108
	}

	void subtraction() {
		float a = 10;
		float b = 30;

		// The operator - is undefined for the argument type(s) String, float
//		System.out.println("Subtraction of two numbers " + b-a);//CE 

		System.out.println("Subtraction of two numbers " + (b - a));
	}

	void multiplication() {
		double a = 10.5;
		double b = 98.25;
		System.out.println("Multiplication of two numbers : " + a * b);
	}

	void division() {
		long l1 = 55;
		long l2 = 4;

		System.out.println("Division of two numbers: " + l1 / l2);// Quotient
	}

	void modulus() {
		long l1 = 55;
		long l2 = 4;
		System.out.println("Modulus of two numbers: " + l1 % l2);// Reminder
	}

	void main() {
		System.out.println("main method started ");
		addition();
		subtraction();
		multiplication();
		division();
		modulus();

		System.out.println("main method ended ");

	}

}
