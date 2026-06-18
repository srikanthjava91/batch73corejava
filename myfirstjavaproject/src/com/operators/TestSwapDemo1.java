package com.operators;

public class TestSwapDemo1 {

	public static void main(String[] args) {

		int a = 43;
		int b = 13;

//		int temp = a;
//		a = b;
//		b = temp;

//		a = a + b;// 30
//		b = a - b;// 10
//		a = a - b;// 20

		// 01010
		// 10100
//		-------------
//		  11110 --> 30 

		a = a ^ b;// 38
		b = a ^ b;//43
		a = a ^ b;//13
		System.out.println("A Value is : " + a);// 20
		System.out.println("B Value is : " + b);// 10

	}

}
