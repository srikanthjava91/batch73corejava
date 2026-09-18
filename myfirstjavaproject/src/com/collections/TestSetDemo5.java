package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSetDemo5 {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(1000);
		ns.add(1500);
		ns.add(2000);
		ns.add(2500);
		ns.add(650);
		ns.add(1200);
		ns.add(500);

//		Returns the greatest element in this set less than 
//		or equal to the given element, or null if there is no such element.
		System.out.println(ns.floor(600));
		
//		Returns the least element in this set greater than 
//		or equal to the given element, or null if there is no such element.
		System.out.println(ns.ceiling(1250));
		
//		Returns the greatest element in this set 
//		strictly less than the given element, or null if there is no such element.
		System.out.println(ns.lower(650));
		
//		Returns the least element in this set 
//		strictly greater than the given element, or null if there is no such element.
		System.out.println(ns.higher(650));

		System.out.println();

	}

}
