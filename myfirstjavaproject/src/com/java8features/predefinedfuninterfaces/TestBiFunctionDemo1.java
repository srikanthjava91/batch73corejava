package com.java8features.predefinedfuninterfaces;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

public class TestBiFunctionDemo1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bif = (i, j) -> i * j;
		System.out.println(bif.apply(10, 15));

		BiFunction<String, String, Integer> bif2 = (s, s1) -> s.length() + s1.length();
		System.out.println(bif2.apply("Java", "Srikanth"));

		IntFunction<Integer> bif3 = (i) -> i * 10;
		System.out.println(bif3.apply(9));
	}
}
