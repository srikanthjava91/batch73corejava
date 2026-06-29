package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to to find factors or divisors of a Given number ..? 
//input  6 -->
//output 1 2 3 6

//input 12 --> 
// output 1 2 3 4 6 12

//input 28 --> 
//output 1 2 4 7 14 28 

public class TestFindFactorsDemo6 {

	// 8
	static void findFactors(int n) {

		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			} 
		}

		System.out.print(n);
		
	}

	public static void main(String[] args) {
		System.out.println("main method staretd !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 6

		findFactors(a);

	}

}
