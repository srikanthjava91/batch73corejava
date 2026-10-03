package com.java8features.predefinedfuninterfaces;

import java.util.function.Predicate;

public class TestPredicateDemo2 {

	public static void main(String[] args) {

		Predicate<String> p1 = (s) -> s.length() > 5;
		Predicate<String> p2 = (s) -> s.contains("h");
		Predicate<String> p3 = p1.and(p2);
		Predicate<String> p4 = p1.or(p2);
		Predicate<String> p5 = p3.negate();

		String[] names = { "Shubman Gill", "Dhoni", "Rohit Sharma", "Rahul", "Virat Kohli", "Jadeja", "Sachin" };

		for (String name : names) {
			if (p5.test(name)) {
				System.out.println(name);
			}
		}
	}
}