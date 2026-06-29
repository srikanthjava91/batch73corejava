package com.logicalstatements.loops;

//Q) WAP to to find the Given number is Perfect or not ..? 

//Perfect number  : The Given number is equals to Sum of it's factors which excludes the Given number.

//input is : 6 --> 1+ 2 + 3 = 6 --> true 
//input is : 10 --> 1 + 2 + 5 = 8 --> false 

//A perfect number is a positive integer that is equal to the sum of its positive proper divisors, 
//excluding the number itself.
//For example, 
//the number 6 has divisors 1, 2, and 3, and 1 + 2 + 3 = 6, making it a perfect number. 
//The first few perfect numbers are 6, 28, 496, and 8128.

import java.util.Scanner;

public class TestFindPerfectDemo7 {

	static boolean findPerfect(int n) {
		boolean status = false;

		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method staretd !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 6

		boolean status = findPerfect(a);

		if (status) {
			System.out.println("The Given number is Perfect ");
		} else {
			System.out.println("The Given number is not Perfect ");
		}

	}

}
