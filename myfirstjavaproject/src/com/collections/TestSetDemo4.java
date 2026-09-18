package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetDemo4 {

	public static void main(String[] args) {

		SortedSet<Integer> ss = new TreeSet<>();

		ss.add(10);
		ss.add(7);
		ss.add(9);
		ss.add(16);
		ss.add(4);
		ss.add(45);
		ss.add(73);
		ss.add(33);
		ss.add(18);

		System.out.println(ss.first());
		System.out.println(ss.last());
//		Returns a view of the portion of this set whose elements 
//		are greater than or equal to fromElement.
		System.out.println(ss.tailSet(33));

//		Returns a view of the portion of this set whose elements are 
//		strictly less than toElement.
		System.out.println(ss.headSet(33));
		
		System.out.println(ss.subSet(16, 73));

		System.out.println(ss);
	}
}
