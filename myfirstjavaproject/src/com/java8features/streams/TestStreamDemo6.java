package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamDemo6 {

	public static void main(String[] args) {
		
		List<Integer> numbers1 = Arrays.asList(10, 20, 30, 40, 50);
		numbers1.stream()
		       .filter(n -> n > 25)
		       .limit(2)
		       .forEach(System.out::println);

		System.out.println("*************************");
		long count = Stream.of("apple", "banana", "cherry","Orange", "Grapes")
						   .filter(a-> a.contains("e"))
						   .count();
		System.out.println(count);
		
		System.out.println("******************************");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		int min = numbers.stream()
			   .filter(i -> i%2==0)
				.map(n -> n * n)
			   .reduce(10, Integer::min);
		
		System.out.println("Sum of the Total elements  : " + min) ;
	}
}
