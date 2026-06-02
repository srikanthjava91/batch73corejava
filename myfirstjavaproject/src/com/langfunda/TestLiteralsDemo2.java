package com.langfunda;

public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		String s = "Java";// String Literals --> SCP
		String s1 = new String("Srikanth");// String Object + Literals --> Heap

		char c1 = 'A';// Single quote values
		char c2 = 10;// ASCII
		char c3 = '\u0000';// Unicode values

		boolean whenYouPrcatice = false;

		if (whenYouPrcatice) {
			System.out.println("You will get a job ");
		} else {
			System.out.println("You will get nothing !");
		}
		
//		String s5 = null; null is a Literal which we can store it in only for Object data types 
//		int i = null;//invalid 

		System.out.println(s);
		System.out.println(s1);

		float f1 = 123;// int --> float
//		float f2 = 123.5;//invalid
		float f3 = 0123;
		float f4 = 0123.5F;
		float f5 = 1230;
		float f6 = 0x123;
//		float f7 = 0x123.5F;//Invalid hex literal number
		float f8 = 0b10;
		float f9 = 0x123F;
		float f10 = 1235F;

//		double d1 = 10D;

		System.out.println(f1);// 123.0
		System.out.println(f3);// 83.0
		System.out.println(f4);// 123.5
		System.out.println(f5);// 1230.0
		System.out.println(f6);// 291.0
		System.out.println(f8);//
		System.out.println(f9);
		System.out.println(f10);

	}

}
