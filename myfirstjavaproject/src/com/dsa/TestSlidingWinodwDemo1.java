package com.dsa;

public class TestSlidingWinodwDemo1 {

	public static void main(String[] args) {

		int[] users = { 50, 70, 120, 200, 300, 40, 35, 40 };
		int days = 3;
		int winodowSum = 0;
		int avg = 0;

		for (int i = 0; i < days; i++) {
			winodowSum = winodowSum + users[i];
		}

		avg = winodowSum / days;
		System.out.println("First 3 days : Window Sum & avg " + winodowSum + " - " + avg);

		for (int i = 1; i < users.length - days; i++) {
			winodowSum = winodowSum - users[i - 1] + users[i + days - 1];

			avg = winodowSum / days;
			System.out.println("Total User Visited :  + " + winodowSum + " - " + avg);

		}

	}

}
