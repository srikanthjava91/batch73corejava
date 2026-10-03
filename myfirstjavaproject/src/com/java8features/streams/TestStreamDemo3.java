package com.java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//WAP to process the Salaries of the Employees ..?
public class TestStreamDemo3 {

	public static void main(String[] args) {

		List<Double> l = new ArrayList<>();

		List<Double> salaries = Arrays.asList(100000.00, 200000.00, 600000.00, 800000.00, 900000.00);
		List<Double> bestSalaries = salaries.stream().filter(s -> s >= 500000.00).collect(Collectors.toList());

		System.out.println(bestSalaries);

		List<Double> updatedSalaries = salaries.stream()
											   .filter(i -> i > 5000000.00)
											   .map(s -> s + 50000.00)
											   .collect(Collectors.toList());
		System.out.println(updatedSalaries);

	}

}
