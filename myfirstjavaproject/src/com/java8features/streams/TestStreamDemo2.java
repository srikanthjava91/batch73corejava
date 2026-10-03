package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(10, 11, 14, 15, 15, 15, 16, 45, 18, 7, 13, 33, 3);
		List<Integer> l2 = l1.stream()
							 .filter(i -> i % 2 == 1)
							 .sorted()
							 .distinct()
							 .collect(Collectors.toList());

		System.out.println(l2);

	}

}
