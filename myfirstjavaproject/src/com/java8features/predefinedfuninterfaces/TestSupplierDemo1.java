package com.java8features.predefinedfuninterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplierDemo1 {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> "srikanth";
		System.out.println(s1.get());

		Supplier<String> s2 = () -> {
			String fname = "Srikanth";
			String lname = "c";
			String fullname = fname + lname;
			return fullname;
		};
		System.out.println(s2.get());
		
		Supplier<Date> s3 = ()-> new Date();
		System.out.println(s3.get());

	}
}
