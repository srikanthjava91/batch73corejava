package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo1 {

	public static void main(String[] args) {

//		Constructs an empty list with an initial capacity of ten.
//		ArrayList --> Re-Sizable Array(DS) 
//		Q1) While Object creating how much Capacity its creating internally ..? 
//		ans: 0 
//		Whenever we are adding first element then only, its creating capacity with 10.
		
//		Q2) When we added 11th element what is next capacity ..? 
//		ans : (Current Capacity * 3/2) or Current capacity + Half of the Current Capacity.

		List<Integer> l1 = new ArrayList<>(15);

		l1.add(7);
		l1.add(18);
		l1.add(1);
		l1.add(45);
		l1.add(33);
		l1.add(77);
		l1.add(9);
		l1.add(10);
		l1.add(3);
		l1.add(4);

		l1.add(8);
		l1.add(99);
		l1.add(8);
		l1.add(99);
		l1.add(8);
		l1.add(99);
		l1.add(8);
		l1.add(99);

		System.out.println(l1);

	}

}
