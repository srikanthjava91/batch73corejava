package com.langfunda;

public class TypesVariablesDemo1 {

	// Primitive + instance
	int id;

	// Object + instance
	String name;

	// Primitive + static
	static int collegeId = 555;

	// Object + static
	static String collegeName = "Vcube";

	public static void main(String[] args) {

		TypesVariablesDemo1 t1 = new TypesVariablesDemo1();

		t1.id = 7;
		t1.name = "Dhoni";
//		 Accessing the instance data by using Object Reference variable 
		System.out.println(t1.id);
		System.out.println(t1.name);

		System.out.println("***********Directly************");
//		Accessing the static data directly 
		System.out.println(collegeId);
		System.out.println(collegeName);
		System.out.println("**********class name*************");
//		Accessing the static data using class name 
		System.out.println(TypesVariablesDemo1.collegeId);
		System.out.println(TypesVariablesDemo1.collegeName);
		System.out.println("**********Object ref variable *************");
//		Accessing the static data by using reference variable  
//		The static field TypesVariablesDemo1.collegeId should be accessed in a static way
		System.out.println(t1.collegeId);
		System.out.println(t1.collegeName);

//		null dot anything is NPE (NullPointerException)
//		Even though the Object is null, There is no impact on static data, 
//		that's why we should access static data by using class name.
		TypesVariablesDemo1 t2 = null;
		
//		System.out.println(t2.id);
//		System.out.println(t2.collegeId);//555
//		System.out.println(t2.collegeName);//Vcube

	}

}
