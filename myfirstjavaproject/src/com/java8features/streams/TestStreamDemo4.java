package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestStreamDemo4 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Venkata Naga Srikanth", "Vishwa", "Vcube","Vcube" , "Java");
		List<String> names1 = names.stream()
								   .filter(s -> s.toUpperCase().startsWith("V"))
								   .map(s -> s.concat("-Java"))
								   .sorted()
								   .distinct()
								   .limit(4)
								   .collect(Collectors.toList());
					  	
		names1.forEach(System.out::println);
	}

}
