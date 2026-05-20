package com.javaintro.garbage;

public class Test1 {

	String name = "Vcube";

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void m1() {
		Test1 t = new Test1();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Test1 t1 = new Test1();

		Test1 t2 = new Test1();

		Test1 t3 = new Test1();

		// Nullifying the Object
		t1 = null;

		// Re-assigining the Object
		Test1 t4 = new Test1();
		t4 = t2;
		System.out.println(t4);
		t4.name = "Mani";

		System.out.println(t2);
		System.out.println("Checking : " + t2.name);
		System.out.println(t3.name);

		// Anonymous Object Creation
		System.out.println(new Test1().name);

		// Object inside the method
		t4.m1();

		System.gc();

		System.out.println("main method ended ");
	}

}
