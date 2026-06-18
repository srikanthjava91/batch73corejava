package com.operators;

//6) Bitwise Operators 
//& | ^ ~
public class TestBitwiseOpDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("********** Bitwise AND & ***********");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false
		// System.out.println(1 && 1);
		System.out.println(1 & 1);
		System.out.println(1 & 0);
		System.out.println(0 & 1);
		System.out.println(0 & 0);
		System.out.println("----------------------------");
		System.out.println(45 & 23);// 5
		System.out.println(82 & 34);// 2
		System.out.println(76 & 24);// 8
		System.out.println(69 & 15);// 5
		System.out.println("********** Bitwise OR | ***********");

		System.out.println(true | true);// true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println(1 | 1);// 1
		System.out.println(1 | 0);// 1
		System.out.println(0 | 1);// 1
		System.out.println(0 | 0);// 0

		System.out.println(45 | 23);// 5
		System.out.println(82 | 34);// 114
		System.out.println(76 | 24);//
		System.out.println(69 | 15);// 79

		System.out.println("****************** Bitwise XOR ^ ***********");
		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println(1 ^ 1);// 0
		System.out.println(1 ^ 0);// 1
		System.out.println(0 ^ 1);// 1
		System.out.println(0 ^ 0);// 0

		System.out.println(45 ^ 23);// 58
		System.out.println(82 ^ 34);// 112
		System.out.println(76 ^ 24);// 84
		System.out.println(69 ^ 15);// 74

		System.out.println("***************Bitwise ~ ******");

		System.out.println(~10);// -(n+1)
		System.out.println(~15);// -(n+1)

	}

}
