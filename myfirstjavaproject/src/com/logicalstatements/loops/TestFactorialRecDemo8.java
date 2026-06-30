package com.logicalstatements.loops;

//input 4 ---> 4! --> output is --> 24 
import java.util.Scanner;

public class TestFactorialRecDemo8 {

	int findFactorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return findFactorial(n - 1) * n;
	}

	void main() {

		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

		int fact = findFactorial(n);
		System.out.println("Factorial of a Given number  :" + fact);
	}
}
