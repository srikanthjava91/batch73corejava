package com.accessmodifiers01;

//Note : Illegal modifier for the class TestAccessDemo1; 
//only public,<default>, abstract, strictfp & final are permitted
public class TestAccessDemo1 {

	static {
		System.out.println("static block from TestAccessDemo1");
	}

	{
		System.out.println("instance block from TestAccessDemo1");
	}

//	private TestAccessDemo1() {
//		System.out.println("no arg constructor called ");
//	}

	public TestAccessDemo1() {
		System.out.println("no arg constructor called ");
	}

//	 private Data members
	private int id1 = 9;
	private String name1 = "Srikanth";

	private void method1() {
		System.out.println("method1 called ");
	}

//	default data members 
	int id2 = 45;
	String name2 = "Rohit Sharma";

	void method2() {
		System.out.println("method2 called ");
	}

//	public data members 
	public int id3 = 18;
	public String name3 = "Virat";

	public void method3() {
		System.out.println("method3 called ");
	}

//	protected data members 
	protected int id4 = 77;
	protected String name4 = "Gill";

	protected void method4() {
		System.out.println("method4 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

//		Accessing the private data members within the class.
		TestAccessDemo1 t = new TestAccessDemo1();
		System.out.println(t.id1);
		System.out.println(t.name1);
		t.method1();

		System.out.println("------------------------");
//		Accessing the default data members within the class.
		System.out.println(t.id2);
		System.out.println(t.name2);
		t.method2();

		System.out.println("------------------------");
//		Accessing the public data members within the class.
		System.out.println(t.id3);
		System.out.println(t.name3);
		t.method3();
		
		System.out.println("------------------------");
//		Accessing the protected data members within the class.
		System.out.println(t.id4);
		System.out.println(t.name4);
		t.method4();

		System.out.println("main method strated ");

	}

//	Inner classes 
	private class TestIn1 {

	}

}
