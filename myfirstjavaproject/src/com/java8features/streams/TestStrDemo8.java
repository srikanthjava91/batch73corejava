package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStrDemo8 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("hello world", "java stream flatmap");
		
		System.out.println(sentences);
       
		List<String> words = sentences.stream()
            .flatMap(s -> Arrays.stream(s.split(" ")))
            .collect(Collectors.toList());
		
		long count = sentences.stream()
	            .flatMap(s -> Arrays.stream(s.split(" "))).count();
		
		System.out.println(count);
//
        System.out.println(words);  // Output: [hello, world, java, stream, flatmap]

	}

}
