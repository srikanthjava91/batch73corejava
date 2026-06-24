package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Marks % for Like 10th Inter BTech ");

		System.out.println("10Th % : ");
		double tenThMarksP = sc.nextDouble();

		System.out.println("Inter % : ");
		double interMarksP = sc.nextDouble();

		System.out.println("Btech % : ");
		double btechMarksP = sc.nextDouble();

		if (tenThMarksP >= 60 && interMarksP >= 60 && btechMarksP >= 60) {
			System.out.println("You are ELigible for MNC Organization Placements !!");
		} else {
			System.out.println("DOn't Give up !! there are lakhs of Startups !! ");
			System.out.println("Marks Does not matters Sklls matters !!");
		}
	}
}
