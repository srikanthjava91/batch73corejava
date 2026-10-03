package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStreamDemo9 {

	public static void main(String[] args) {
		long startMillinSec = System.currentTimeMillis();
		
		List<Integer> numbers =
			    Arrays.asList(50, 10, 40, 20, 30);

			Optional<Integer> max =
			    numbers.stream()
			           .max(Integer::compareTo);

			System.out.println(max.get());

			long endMilliSec = System.currentTimeMillis();
			
			System.out.println(endMilliSec - startMillinSec);
		
//		 List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Jim");
//		 names.parallelStream()
//		 	  .forEach(name -> System.out.println(Thread.currentThread()));
		 
	}

}
