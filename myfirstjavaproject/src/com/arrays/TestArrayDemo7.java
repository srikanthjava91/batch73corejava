package com.arrays;

import java.util.Scanner;

//Q) WAP to find min & max elements from a GIven Array ..? 
//Q) WAP to Read the Elements from Console through Scanner..? 
public class TestArrayDemo7 {

//	static void findMinMax(int[] n) {
//
//		int min = n[0];
//		int max = n[0];
//
//		for (int n1 : n) {
//
//			if (n1 < min) {
//				min = n1;
//			} else if (n1 > max) {
//				max = n1;
//			}
//		}
//
//		System.out.println("Min value is : " + min);
//		System.out.println("Max value is : " + max);
//
//	}

	static void findPrimeNumbers(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}

	}

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an Array : ");

		int size = sc.nextInt();// 5
		int[] arr = new int[size];

		System.out.println("Enter the elements based on the size :" + size);
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Calling findMinMax() method
//		findMinMax(arr);
		findPrimeNumbers(arr);

		System.out.println("main method ended ");
	}

}
