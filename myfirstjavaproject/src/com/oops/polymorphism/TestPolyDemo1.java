package com.oops.polymorphism;

public class TestPolyDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestPolyDemo1 t1 = new TestPolyDemo1();

		byte b1 = 127;
		System.out.println(b1);

		char[] ch = { 'A', 'P', 'P' };
		System.out.println(System.identityHashCode(ch));

		System.out.println();
		System.out.println(true);
		System.out.println('M');

		System.out.println(ch);
		System.out.println(8765435678.987654);
		System.out.println(87654.098765F);

		System.out.println(9876578);
		System.out.println(987654678987L);

		System.out.println(t1);
		System.out.println("main method ended ");

	}

}
