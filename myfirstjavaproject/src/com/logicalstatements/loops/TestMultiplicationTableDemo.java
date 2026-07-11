package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Math Table for a Given number 
// Input is : 9 for which table 
// Input is Up to where you want to print 
// output should be like below 

// 9 X 1 = 9 
// 9 X 2 = 18 
// 9 X 3 = 27
//.......
//9 X 20 = 180 
public class TestMultiplicationTableDemo {

	public static void main(String[] args) {
		System.out.println("math table info ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Which table you want ..? ");
		int n1 = sc.nextInt();// 9

		System.out.println("How many values you want to print ..?");
		int n2 = sc.nextInt();// 20

		for (int i = 1; i <= n2; i++) {
			System.out.println(n1 + " X " + i + " = " + n1 * i);
		}

	}

}
