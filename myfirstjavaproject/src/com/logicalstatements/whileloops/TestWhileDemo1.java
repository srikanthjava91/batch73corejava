package com.logicalstatements.whileloops;

import java.util.Scanner;

//Q) WAP to print sum of all the elements from given number ..? 
//input : number : 123 or 456 or 987 or 34567 
//output : sum : 6 or 15 or 24 or 25 
public class TestWhileDemo1 {

	static int findSum(int n) {
		int sum = 0;
		int r = 0;
		int count = 0;
		while (n > 0) {
			r = n % 10;// 349%10=9, 34%10 = 4, 3%10 =3
			n = n / 10; // 349/10 =34, 34/10 = 3,3/10 = 0
			sum += r;// 9+4 = 13+3 = 16
			count++;

		}

		System.out.println("Count of the DIgits : " + count);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 234
		int sum = findSum(n);
		System.out.println("sum of all the digits = " + sum);
		sc.close();
	}
}
