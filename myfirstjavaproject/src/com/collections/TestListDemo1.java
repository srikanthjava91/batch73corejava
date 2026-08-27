package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo1 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		// 1 10 30 20 15 12 16 14
		l1.add(10);
		l1.add(15);
		l1.add(12);
		l1.add(16);
		l1.add(14);
		l1.add(1, 20);
		l1.add(0, 1);
		l1.add(2, 30);
		l1.add(10, 100);// IndexOutOfBoundsException

		l1.add(null);
		l1.add(null);
		l1.add(null);

		System.out.println(l1);

	}

}
