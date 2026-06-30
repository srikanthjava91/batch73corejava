package com.logicalstatements.loops;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 21 ....
public class TestFibbonacciDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("how many values you want to print..?  ");
		int n = sc.nextInt();// 10

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + " " + n2 + " ");

		for (int i = 1; i <= n-2; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");// 1

			n1 = n2;//
			n2 = n3;
			
		}
	}

}
