package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to  print Product of 1 to 5 numbers ..? 
//(Factorial of a Given number )
//4! = 4 * 3 *2 *1 = 24
//5! = 5 * 4 * 3 *2 *1 = 120 
public class TestLPDemo5 {

	int findFact(int n) {
		int fact = 1;

		if (n == 0 || n==1) {
			return 1;
		}

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

	void main() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int factorial = findFact(n);
		System.out.println("Factorial of a Given number : " + factorial);

		sc.close();

	}

}
