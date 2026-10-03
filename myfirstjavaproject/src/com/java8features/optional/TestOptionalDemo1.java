package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo1 {

	public static void main(String[] args) {
//		String name = null;
		Optional<String> name = Optional.empty();
		System.out.println(name);// NPE

		System.out.println("*****Creating Optional**************");
		String name2 = "Srikanth";
		Optional<String> opt = Optional.of(name2);
		System.out.println(opt);
		System.out.println("*******************");

		String name1 = null;
		Optional<String> opt1 = Optional.ofNullable(name1);
		System.out.println(opt1);

		System.out.println("*******************");
		Optional<String> opt2 = Optional.empty();
		System.out.println(opt2);

	}
}
