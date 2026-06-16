package com.operators;

//x++ --> x= x+1 
public class TestUnaryOpDemo4 {

	public static void main(String[] args) {

		int x = 10;
		int y = 11;

		System.out.println(x++);// 10 --> 11
		System.out.println(++x);// 12
		System.out.println(--y);// 10
		System.out.println(--x);// 11
		System.out.println(--x);// 10
		System.out.println(++y);// 11
		System.out.println(++x);// 11
		System.out.println(y++);// 11 --> 12
		System.out.println(x++);// 11 --> 12
		System.out.println(x--);// 12 --> 11
		System.out.println(y--);// 12 --> 11
		System.out.println(--y);// 10
		System.out.println(y--);// 10 --> 9
		System.out.println(x--);// 11 --> 10
		System.out.println(--x);// 9
		System.out.println(++x);// 10
		System.out.println("X value  : " + x);// 10
		System.out.println("Y value  : " + y);// 9

		// y = 10 --> 9
		// 11+ 10 + 10 + 10
		System.out.println(++x + ++y + y-- + --x);

		System.out.println("X value  : " + x);// 10
		System.out.println("Y value  : " + y);// 9
		// x=11
		// 10 + 10 + 11 + 10
		System.out.println(x++ + ++y + ++y + --x);

		System.out.println("X value  : " + x);// 10
		System.out.println("Y value  : " + y);// 9

		System.out.println(x++ + y++ + y-- + x-- - y++ - x++ + y++);
		
	}

}
