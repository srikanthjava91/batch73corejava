package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo7 {

	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("a", "b");
		
		
		
		List<List<String>> nestedList = Arrays.asList(
										Arrays.asList("a", "b"),
										Arrays.asList("c", "d"),
										Arrays.asList("e", "f"));
		
		System.out.println(nestedList);
		
		List<String> flattenList = nestedList.stream()
								  .flatMap(List::stream)
								  .collect(Collectors.toList());
		
		System.out.println(flattenList);

	}

}
