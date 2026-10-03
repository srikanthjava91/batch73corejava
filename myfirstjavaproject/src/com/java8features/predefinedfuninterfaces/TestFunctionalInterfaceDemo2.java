package com.java8features.predefinedfuninterfaces;

import java.util.function.Function;

public class TestFunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = (i) -> i * 5;
		System.out.println(f1.apply(87));

		Function<String, Integer> f2 = (s) -> s.length();
		System.out.println(f2.apply("Java is simple in Vcube "));

		Function<String, String> f3 = (s) -> s.toUpperCase().substring(5);
		System.out.println(f3.apply("Good morning guys, Have a nice day !!"));

		Function<Integer, String> f4 = (i) -> Integer.toString(i);
		System.out.println(f4.apply(4567) +" Java");

	}

}
