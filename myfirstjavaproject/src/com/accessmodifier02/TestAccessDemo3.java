package com.accessmodifier02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {

		TestAccessDemo1 t = new TestAccessDemo1();

		System.out.println("------------------------");
//		Accessing the default data members outside of the packages not possible 
//		even though the class & constructor is public 
//		System.out.println(t.a2);
//		System.out.println(t.name2);
//		t.method2();

		System.out.println("------------------------");
//		Accessing the public data members within same package
		System.out.println(t.id3);
		System.out.println(t.name3);
		t.method3();

		System.out.println("------------------------");
//		Accessing the protected data members outside of the packages are not possible..!! 
//		what is the Difference between default + protected ..? 
//		protected data we can access within the class + within the package + 
//		outside of the packages of sub classes  + subclass object reference only.
		TestAccessDemo3 t1 = new TestAccessDemo3();
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();
		System.out.println("main method started from TestAccessDemo3 ");
	}

}
