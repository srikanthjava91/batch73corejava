package com.operators;

//Unary Operators : + - ++ -- 
//a++ --> a= a+1
//++a --> a = a+1 
public class TestUnaryOpDemo3 {

	public static void main(String[] args) {

		int a = 6;
		int b = 5;

		System.out.println(+a);// 6//Unary +
		System.out.println(-b);// -5 // Unary -
		System.out.println(a++);// Post Increment --> 6 --> 7
		System.out.println(++a);// Pre-Increment --> 8

		System.out.println(--b);//4
		System.out.println(b--);//4 -->3 

	}

}
