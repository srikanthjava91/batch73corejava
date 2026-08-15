package com.exceptionhandling;

public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			// Conversion of String to int
			String str = "123";
			int n1 = Integer.parseInt(str);// 123 int
			System.out.println(n1 * 10);// 1230
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String str1 = "ten";
			int n2 = Integer.parseInt(str1);
			System.out.println(n2 * 10);//
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main method ended ");

	}

}
