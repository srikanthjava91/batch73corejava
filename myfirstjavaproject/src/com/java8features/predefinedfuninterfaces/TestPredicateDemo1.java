package com.java8features.predefinedfuninterfaces;

import java.util.function.Predicate;

public class TestPredicateDemo1 {

	public static void main(String[] args) {

		double[] marks = { 65, 75, 82, 56, 84, 99 };

		Predicate<Double> p6 = (d) -> d >= 75;
		for (double m : marks) {
			if (p6.test(m)) {
				System.out.println(m);
			}
		}

		System.out.println("-----------------------------");
		Predicate<Integer> p1 = (i) -> i % 2 == 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));

		Predicate<Integer> p2 = (a) -> a * a > 100;
		System.out.println(p2.test(10));// false
		System.out.println(p2.test(11));// true

		System.out.println("********************************");
		Predicate<String> p3 = (s) -> s.length() > 15;
		System.out.println(p3.test("Venkata Naga Srikanth"));// true

		Predicate<String> p4 = (s) -> s.equalsIgnoreCase("Java@123");
		System.out.println(p4.test("java@123"));//

		System.out.println("********************************");

		String s2 = "Srikanth";
		Predicate<String> p5 = (s) -> s == s2;
		System.out.println(p5.test("Srikanth"));

	}
}
