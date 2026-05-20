package com.javaintroduction;

//Class name, Super class name and static related data is storing it into Method area.
//And class MetaData(Data about the data) is also storing it into Method area.
public class TestDemo3 {

	// static data --> method area (When the class is loading )
	static String name = "Vcube";

	// instance data --> Heap area (When we create an Object)
	String name1;

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(name);
		//Cannot make a static reference to the non-static field name1
//		System.out.println(name1);
		
		TestDemo3 t3 = new TestDemo3();//Object Creation 
		System.out.println(t3.name1);//null
		
	}

}
