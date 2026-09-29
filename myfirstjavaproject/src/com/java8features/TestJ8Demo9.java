package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Lambda Expressions vs Collections 
public class TestJ8Demo9 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(20);
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(30);
		al.add(0);
		al.add(15);

		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0;
		Collections.sort(al, c);
		System.out.println(al);

	}
}
