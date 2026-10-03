package com.java8features.predefinedfuninterfaces;

import java.util.function.Function;

public class TestFunctionDemo3 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = (i) -> i * 4;
		Function<Integer, Integer> f2 = (i) -> i * i;

		System.out.println(f1.apply(2));
		System.out.println(f1.andThen(f2).apply(2));// 64
		System.out.println(f1.compose(f2).apply(2));// 16
		System.out.println(f2.andThen(f1).apply(2));
	}
}
