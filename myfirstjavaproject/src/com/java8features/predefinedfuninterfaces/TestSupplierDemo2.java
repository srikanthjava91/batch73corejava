package com.java8features.predefinedfuninterfaces;

import java.util.function.Supplier;

//Math.random() --> Returns a double value with a positive sign, 
//greater than or equal to 0.0 and less than 1.0.
//   x >= 0.0 --> x <1.0 ---> 0.999

public class TestSupplierDemo2 {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> {
			String otp = "";

			for (int i = 1; i <= 8; i++) {
				otp = otp + (int) (Math.random() * 10);
			}

			return otp;
		};
		
		System.out.println(s1.get());

	}

}
