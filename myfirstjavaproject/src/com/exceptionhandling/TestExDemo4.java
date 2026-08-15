package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			String str = "Srikanth";
			System.out.println(str.length());// 8
			System.out.println(str.charAt(5));// n
//			Index 10 out of bounds for length 8
			System.out.println(str.charAt(10));//
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.toString());
		}

		System.out.println("main method ended ");
	}

}
