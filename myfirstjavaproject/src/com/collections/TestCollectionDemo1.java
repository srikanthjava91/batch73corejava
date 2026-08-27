package com.collections;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

		Object[] arr = new Object[5];
		arr[0] = "Srikanth";
		arr[1] = 101;
		arr[2] = 5.9;
		arr[3] = 75.5;
		arr[4] = "Vcube";

//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();

		c.add(40);
		c.add(50);
		c.add(60);
		c.add(10);
		c.add(20);
		c.add(30);

//		c.add("Apple");
//		c.add("Orange");
//		c.add("Banana");
//		c.add("Pineapple");

//		c.add(55.5F);
//		c.add(55.5D);
//		c.add(55.5);

		System.out.println(c);

	}
}
