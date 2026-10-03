package com.java8features.predefinedfuninterfaces;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class TestBiPredicateDemo1 {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p1 = (i1, i2) -> i1 * i2 % 2 == 0;
		System.out.println(p1.test(9, 8));

		BiPredicate<String, String> p2 = (s1, s2) -> s1.concat(s2).length() > 15;
		System.out.println(p2.test("Java is simple", "in Vcube"));

		IntPredicate ip = (i2) -> i2 % 2 == 1;
		System.out.println(ip.test(10));

		LongPredicate lp = (i) -> i * i > 100;
		System.out.println(lp.test(9));

	}
}
