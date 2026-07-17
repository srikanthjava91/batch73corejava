package com.accessmodifiers01;

//Note : Illegal modifier for the class TestAccessDemo1; 
//only public,<default>, abstract, strictfp & final are permitted
public class TestAccessDemo1 {
	
	
	
	private TestAccessDemo1(){
		System.out.println("no arg constructor called ");
	}

	private static int id1 = 9;
	private String name1 = "Srikanth";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		
//		Accessing the private data members within the class.
		TestAccessDemo1 t = new TestAccessDemo1();
		System.out.println(t.id1);
		System.out.println(t.name1);
		t.method1();
		
		System.out.println("main method strated ");

	}

//	Inner classes 
	private class TestIn1 {

	}

}
