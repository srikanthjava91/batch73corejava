package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();
		boys.add("Venkatrao");
		boys.add("Rohit");
		boys.add("Abhishek");
		boys.add("Bhanu");
		boys.add("Shiva");
		boys.add("Sandeep");
		System.out.println(boys);

		Collection<String> girls = new ArrayList<>();
		girls.add("Aarathi");
		girls.add("Priyanka");
		girls.add("Srividhya");
		girls.add("Abhigna");
		girls.add("Abhigna");
		girls.add("Vishnu Priya");
		System.out.println(girls);

		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);

//		boys.clear();//[]

		System.out.println("********************************");
		System.out.println(students);
		System.out.println(boys);

		System.out.println(students.contains("Sandeep"));
		System.out.println(students.contains("Srikanth"));
		System.out.println(boys.contains("Shiva"));// false

//		Returns true if this collection contains all of the elements in the specified collection.
		System.out.println("-----------------------------");
		System.out.println(students.containsAll(girls));// true
		System.out.println(boys);
//		boys.add("Srikanth");
		System.out.println(students.containsAll(boys));//

//		boys.remove("Bhanu");
		System.out.println(boys);
		students.removeAll(boys);
		System.out.println(students);
		
//		length vs length() vs size()
		System.out.println(students.size());
		
		

	}

}
