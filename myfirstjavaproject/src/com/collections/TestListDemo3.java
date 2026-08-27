package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo3 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(6);
		l1.add(9);
		l1.add(10);
		l1.add(11);
		l1.add(15);
		
		l1.set(3, 100);

//		Iterator<Integer> itr = l1.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println("-------------------------");

		ListIterator<Integer> litr = l1.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("*******************************");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		l1.remove(l1.indexOf(6));// IndexOutOfBoundException
//		System.out.println(l1);

	}

}
