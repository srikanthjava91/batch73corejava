package com.langfunda;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {

		// Decimal Literals
		int a1 = 100;
		int a2 = 123;
		int a3 = 1230;

		// Octal Literals starts with 0 and the base is 8 --> 0 to 7
//		0 +1*8^2 +2*8^1 +3*8^0  ==> 64 + 16 + 3 = 83 
		int a4 = 0123;
		int a5 = 0456;
//		int a6 = 0789;//521 //The literal 0789 of type int is out of range 
//		int a7 = 0568;//376 //The literal 0789 of type int is out of range 

		// Hexa-Decimal Literals starts with 0x (base16) and the values are 0 to 9
		// a=10 b=11 c=12 d=13 e=14 f =15
		int a6 = 0x123;
		// 1*16^2 +2*16^1 +3*16^0
		// 256 + 32 + 3 = 291
		int a7 = 0xabc;// 2748
		int a8 = 0X12ab;// 4779
		int a9 = 0xBEe;// 3054
		int a10 = 0xDAD;// 3501
//		int a11 = 0xBeer;
		
//		Binary Literals starts with 0b (base 2) and the range is 0 and 1 only.
		int a12 = 0b10101;
		int a13 = 0b11010;
		int a14 = 0b001001;
		int a15 = 0b11111;

		System.out.println(a1);// 100
		System.out.println(a2);// 123
		System.out.println(a3);// 1230
		System.out.println(a4);// 83
		System.out.println(a5);

		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);

	}

}
