package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo2 {

	public static void main(String[] args) {
		
		Optional<String> opt = Optional.ofNullable("Java");
		opt.ifPresent(value -> System.out.println(value));
		
		Optional<String> opt2 = Optional.ofNullable(null);
		opt2.ifPresent(value -> System.out.println(value));
		
		System.out.println("**********************");
		Optional<String> opt1 = Optional.empty();
//		System.out.println(opt1.get());
		System.out.println("***************************");
		String[] names = { "Java", "React", "Servlets", null, "Jsp" };

		for (String name : names) {
//			System.out.println(name.toUpperCase());
			Optional<String> opt3 = Optional.ofNullable(name);
			if (opt3.isPresent()) {
				System.out.println(opt3.get());
			}
		}
	}
}
