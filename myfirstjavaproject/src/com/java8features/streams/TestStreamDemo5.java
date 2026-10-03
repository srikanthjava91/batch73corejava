package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//String::toUpperCase
//:: --> Double colon Operator will consider as Method Reference 
public class TestStreamDemo5 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("j2se","j2ee","frameworks","dsa");
		List<String> names1 = names.stream()
								   .map(String::toUpperCase)
								   .collect(Collectors.toList());
		names1.forEach(System.out::println);

	}

}
