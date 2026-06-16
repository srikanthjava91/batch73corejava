package com.operators;

//1) Arithmetic Operators
//+ - * / % 
//= -> Addition 		--> sum 	--> 10+ 20 =30 
//- -> Subtraction 		--> Difference --> 30-20 = 10
//* -> Multiplication	--> Product  --> 10 * 10 = 100 
// / -> Division 		--> Quotient  --> 100/10 = 10  --> 10)100(10 -->   10)1(0
// % -> Modulus 		--> Reminder --> 97 %10 = 7   --> 10)97(9 --> 7 
//% -> Modulus 			--> Reminder --> 97 %4 = 1 
public class TestArithmeticOpDemo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int x = 93;
		int y = 6;

//		BODMAS
		System.out.println("Addition of Two numbers  : " + a + b);// 1020
		System.out.println("Addition of Two numbers  : " + (a + b));// 30

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction : " + a -b);//CE 
		System.out.println("subtraction  :" + (a - b));// -10

		System.out.println("Multiplication : " + a * b);// 200

		System.out.println("Division : " + x / y);// 15
		System.out.println("Modulus : " + x % y);// 3

		System.out.println(Math.pow(2, 3));

	}

}
