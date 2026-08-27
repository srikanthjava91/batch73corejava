package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo4 {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Chikku");
		fruits.add("Orange");

		if (!fruits.isEmpty()) {
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Grapes");
			fruits.add("Pineapple");
		}

		System.out.println(fruits);

//		Scenario-1 : for each loop 
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("------------------");

//		Scenario-2 : using cursors with Iterator interface
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			if (itr.next().equals("Banana")) {
				itr.remove();
			}
		}

		System.out.println(fruits);
		System.out.println("------------------");
		// Convberting Collections to ARray using toArray()
		Object[] objArr = fruits.toArray();

//		for (Object obj : objArr) {
//			System.out.println(obj);
//		}

		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}

	}
}
