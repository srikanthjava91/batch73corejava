package com.javaintro.garbage;

public class Test2 {

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	Test2 i ;

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();

		System.out.println(t2.i);
		t1.i = t3;
		t2.i = t1;
		t3.i = t2;

		t1 = null;
		t2 = null;
		t3 = null;

		System.gc();

	}

}
