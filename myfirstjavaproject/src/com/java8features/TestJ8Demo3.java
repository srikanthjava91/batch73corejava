package com.java8features;

interface In3 {
	void hello(String name);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {
		In3 i3 = str -> System.out.println("Hello Mr/mrs : " + str);
		i3.hello("Srikanth");
	}

}
