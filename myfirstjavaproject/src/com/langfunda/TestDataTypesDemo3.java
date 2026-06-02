package com.langfunda;

//String is a Object Data Type we can create in multiple ways : 
//Like String lIterals, String with Objects and so on.....

//String means Collection of characters with double quotes store it into a  single variable.

public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		System.out.println(a == b);

		String s = "Srikanth";// String Literals --> SCP
		String s1 = "Srikanth";// String Literals --> SCP

		String s2 = new String("Srikanth");// new Object --> Heap
		String s3 = new String("Srikanth");// new Object --> Heap

		String s4 = new String("Santosh");// 2 objects
		String s5 = "Santosh";// 0 objects

		String s6 = s4;

		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s2 == s3);
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);// true
		System.out.println(s4.equals(s5));

	}
}
