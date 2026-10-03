package com.java8features.predefinedfuninterfaces;

import java.util.function.Consumer;

public class TestConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println("Welcome to Vcube  Mr:  " + s);
		c1.accept("Srikanth");

		Consumer<Integer> c2 = (a) -> {
			int sum = a + 150;
			System.out.println("Sum : " + sum);
		};

		c2.accept(850);

	}

}
