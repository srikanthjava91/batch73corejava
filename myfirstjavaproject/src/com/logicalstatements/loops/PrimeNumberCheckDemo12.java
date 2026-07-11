package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeNumberCheckDemo12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nUmber ");
		int a = sc.nextInt();
	
		boolean status = isPrime(a);
	
		if(status) {
			System.out.println("The Given number is Prime ");
		}else {
			System.out.println("The Given number is not prime");
		}
	}
	
	
	static boolean isPrime(int n) {
		boolean flag = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;

	}

}
