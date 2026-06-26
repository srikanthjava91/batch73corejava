package com.logicalstatements.loops;

//Q) WAP to print sum of 0 to 10 numbers ..? 
public class TestLpDemo4 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}

		System.out.println("sum of all number from 0 to10  : " + sum);

	}

}
