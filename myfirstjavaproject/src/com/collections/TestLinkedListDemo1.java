package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>();

		ll.add(5);
		ll.add(5);
		ll.add(15);
		ll.add(52);
		ll.add(25);
		ll.add(51);
		ll.add(15);
		ll.add(85);
		ll.add(75);

		System.out.println(ll);
	}
}
