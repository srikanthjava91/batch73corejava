package com.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(45);
		l.add(77);
		l.add(18);
		l.add(10);
		l.add(8);
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(7);

		Stream<Integer> st = l.stream();
		Stream<Integer> st1 = st.filter(i -> i % 2 == 0);
		List<Integer> l1 = st1.collect(Collectors.toList());
		System.out.println(l1);
	}
}
