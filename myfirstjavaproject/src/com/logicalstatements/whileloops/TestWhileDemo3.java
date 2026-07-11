package com.logicalstatements.whileloops;

import java.util.Scanner;

public strictfp class TestWhileDemo3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started ");
		
		Thread.sleep(2000);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		boolean status = isArmStrong(n);

		if (status) {
			System.out.println("The Given number is Armstrong !!");
		} else {
			System.out.println("The Given number is not Armstrong !!");
		}

		System.out.println("main method ended ");
		sc.close();
	}

	static boolean isArmStrong(int n) {
		boolean status = false;
		int sumP = 0;
//		int count = 0;
		int r = 0;
		int n1 = n;// 153
		int temp = n;
		
		String str = Integer.toString(n);//153
		int count = str.length();

//		while (n > 0) {
//			r = n % 10;// 153%10=3,15%10=5,1%10=1
//			n = n / 10;// 153/10=15,15/10=1,1/10=0
//			count++;
//		}

		while (n1 > 0) {
			r = n1 % 10;// 153%10=3,15%10=5,1%10=1
			n1 = n1 / 10;// 153/10=15,15/10=1,1/10=0
			sumP = (int) (sumP + Math.pow(r, count));// 27+ 125+1 = 153
		}

		if (temp == sumP) {
			status = true;
		}

		return status;
	}
}
