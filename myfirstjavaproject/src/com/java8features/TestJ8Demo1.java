package com.java8features;

@FunctionalInterface
interface In1 {
	public abstract void hello();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		In1 t1 = () -> System.out.println("Hello Guys, Good Morning !!");
		t1.hello();
		System.out.println("main method ended ");
	}
}
