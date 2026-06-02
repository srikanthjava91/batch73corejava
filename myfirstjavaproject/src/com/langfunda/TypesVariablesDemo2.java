package com.langfunda;

//Note : JVM wil not provide default values for local variable, 
//developers must need to provide values based our requirements.
public class TypesVariablesDemo2 {

	static int x = 100;
//	var i = 10;//'var' is not allowed here
	static String name2 = "Vcube";

	public static void main(String[] args) {
		
//		static String name2 = "Srikanth";//Illegal modifier for parameter name2; only final is permitted
		System.out.println(name2);

		int a;
//		The local variable a may not have been initialized
//		System.out.println(a);

//		int x;
		x = 22;
		System.out.println(x);
		System.out.println(TypesVariablesDemo2.x);
		
		var a1 = 100;
		var name1 = "Srikanth";
		var gen = 'm';
		System.out.println(a1);
		System.out.println(name1);
		System.out.println(gen);
		
		
		

	}

}
