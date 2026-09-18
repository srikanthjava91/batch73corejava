package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestListDemo7 {

	public static void main(String[] args) {

//		java.lang.UnsupportedOperationException
		List<Integer> li = Arrays.asList(10, 23, 33, 43, 50, 60, 70, 80);
		System.out.println(li);
//		li.add(0, 100);
		System.out.println(li);
	}
}
