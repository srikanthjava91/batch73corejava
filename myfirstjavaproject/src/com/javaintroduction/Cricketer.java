package com.javaintroduction;

//WAP to Represent Indian Cricket Team info.?
//Whenever the data is not changing from Object to Object then we can go and keep static for those data.
//For static data, it's not create a new copy for every object.

//Whenever the data is changing from Object to Object then we can go and keep instance for those data.
//For instance data, it's creating a new copy for every object.

//static data is loading when the class is loading and it is storing it into method area.
//instance data is loading when the object is creating and it is storing into Heap Area.
public class Cricketer {

	// Declaration
	// instance data
	int jno;
	String name;

	// static data
	static int countryId = 91;
	static String countryName = "INDIA";

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Indian Cricket Team !!");

//		Accessing the instance data
//		We cannot access the instance data in static area.
//		Cannot make a static reference to the non-static field jno
//		System.out.println(jno);
//		Cannot make a static reference to the non-static field name
//		System.out.println(name);

		// LHS : Cricketer is a class name
		// msd is a Object Reference variable

		// RHS : new is a Java keyword to create object.
		// Cricketer() is a constructor calling.
		// RHS is Object creation that we are storing it into a msd reference variable
		// Accessing the instance data by using Object reference variable
		System.out.println("Object1 info *************");
		Cricketer msd = new Cricketer();// Object Creation

//		Accessing the static data :
//		JVM will provide default values for static & instance data
//		countryId = 91;
//		countryName = "India";

		System.out.println("County ID : " + countryId);// 0
		System.out.println("Country Name : " + countryName);// null

		// Initialization or Re-assigining
		msd.jno = 7;
		msd.name = "Mahendra Singh Dhoni";

		System.out.println("Jersey Number :" + msd.jno);
		System.out.println("Cricketer Name : " + msd.name);

		System.out.println("Object2 info *************");
		Cricketer vk = new Cricketer();// Object Creation
		vk.jno = 18;
		vk.name = "Virat Kohli";
		System.out.println("County ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number :" + vk.jno);
		System.out.println("Cricketer Name : " + vk.name);

		System.out.println("Object3 info *************");
		Cricketer rs = new Cricketer();// Object Creation
		rs.jno = 45;
		rs.name = "Rohit Sharma";
		System.out.println("County ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number :" + rs.jno);
		System.out.println("Cricketer Name : " + rs.name);

		System.out.println("Object4 info *************");
		Cricketer kl = new Cricketer();// Object Creation
		countryId = 92;
		countryName = "Bharath";
		kl.jno = 1;
		kl.name = "K Lokesh Rahul";
		System.out.println("County ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number :" + kl.jno);
		System.out.println("Cricketer Name : " + kl.name);

		System.out.println("Object5 info *************");
		Cricketer rj = new Cricketer();// Object Creation
		rj.jno = 8;
		rj.name = "Ravindra Jadeja";
		System.out.println("County ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number :" + rj.jno);
		System.out.println("Cricketer Name : " + rj.name);

	}
}
