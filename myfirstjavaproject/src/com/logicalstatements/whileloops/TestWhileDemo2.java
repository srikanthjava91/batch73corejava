package com.logicalstatements.whileloops;

import java.util.Scanner;

//Q) WAP to find the Given number is Palindrome or not ..? 
//Q) WAP to find Reverse number of a Given number ..? 
//input is number : 456 
//Output Reverse number is : 654 

//input is number : 876 
//Output Reverse number is : 678

//input is number : 3443 
//Output Reverse number is : 3443 

public class TestWhileDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 456

		int rev = reverseNumber(n);//654 
		
		if(n==rev) {
			System.out.println("The Given number is Palindrome !!");
		}else {
			System.out.println("The Given number is not a Palindrome !!");
		}

		System.out.println("Reverse number of Given number : " + rev);

		sc.close();
	}

	private static int reverseNumber(int n) {
		int rev = 0;
		int rem = 0;

		while (n > 0) {
			rem = n % 10;// 456%10=6, 45%10=5, 4%10 = 4
			n = n / 10;// 456/10 = 45,45/10 =4, 4/10 = 0
			rev = rev * 10 + rem;// 6--> 60+5 =65--> 650+4 = 654
		}

		return rev;
	}

}
