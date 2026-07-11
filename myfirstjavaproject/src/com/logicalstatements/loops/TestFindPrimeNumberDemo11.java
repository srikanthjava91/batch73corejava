package com.logicalstatements.loops;

import java.util.Scanner;

public class TestFindPrimeNumberDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Range of prime number you want to print ..? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
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
