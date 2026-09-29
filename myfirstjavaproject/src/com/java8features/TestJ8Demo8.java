package com.java8features;

//Functional interface WRT inheritance 

@FunctionalInterface
interface In8 {
	void method1();
}

@FunctionalInterface
//CE : Invalid '@FunctionalInterface' annotation; In9 is not a functional interface
interface In9 extends In8 {
//	void method2();
}

public class TestJ8Demo8 {

	public static void main(String[] args) {
		In9 i9 = () -> {
			System.out.println("hello method1 ");
		};

		i9.method1();
	}
}
