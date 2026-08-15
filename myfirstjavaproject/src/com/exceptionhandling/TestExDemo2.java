package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String str = "Srikanth";
		System.out.println(str.length());// 8

		String str1 = "null";
		System.out.println(str1.length());// 4

		String str2 = "";
		System.out.println(str2.length());// 0
		String str3 = null;
		try {
			
//		null dot any operation is NullPointerException
			System.out.println(str3.length());// NPE :
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}

		System.out.println("main method ended ");
	}

}
