package com.operators;

public class TestUnaryOpDemo5 {

	public static void main(String[] args) {

		double d = 0.5;
		System.out.println(d++);// 0.5
		System.out.println(d);// 1.5

		int a = 10;//
		a = a++;//
		
		int b = 11;
		int c = b++;

		System.out.println(a);//10
		System.out.println(a);
		
		System.out.println(c);
	}
}
