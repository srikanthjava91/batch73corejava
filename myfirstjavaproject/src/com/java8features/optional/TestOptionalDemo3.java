package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo3 {

	public static void main(String[] args) throws Exception {
		
		String name = null;

		String result = Optional.ofNullable(name)
		                .orElseThrow(() -> new Exception("vaue is not there"));

		System.out.println(result);


	}

}
