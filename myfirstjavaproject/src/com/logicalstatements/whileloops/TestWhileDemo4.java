package com.logicalstatements.whileloops;

import java.util.Scanner;

//WAP to Convert Decimal to Binary ..? 
//10 --> 1010 
//45 --> 101101
//18 --> 10010 
//100 --> 
//
public class TestWhileDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();

		convertDecimalToBinary(n);

		System.out.println("main method ended !!");

	}

	static void convertDecimalToBinary(int n) {

		int r = 0;
		String bin = "";

		while (n > 0) {
			r = n % 2;// 9%2=1, 4%2=0,2%2=0,1%2=1
			n = n / 2;// 9/2=4,4/2=2,2/2=1,1/2=0
			bin = r + bin;
		}

		System.out.println("Binary number from a Given numbe r: " + bin);

	}

}
