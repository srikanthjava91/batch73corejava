package com.java8features.optional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateDemo1 {

	static final String OLD_FORMAT = "dd/MM/yyyy";
	static final String NEW_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {
		long startMillinSec = System.currentTimeMillis();
		java.util.Date date = new java.util.Date(startMillinSec);
	
//		Date date = new Date(785486988745L);
		System.out.println(date);
		
		/*
		 * System.out.println("**************"); // int to byte --> Explicit Type
		 * casting byte b = (byte) 130; // int to Integer --> Auto-Boxing Integer i2 =
		 * 200; float f = (float) 55.5; double d1 = 55.5F;
		 * 
		 * // String to int conversion : Parsing String i = "100"; int i1 =
		 * Integer.parseInt(i); System.out.println(i1 + 200); //
		 * System.out.println("**************");
		 * 
		 * 
		
		 *///		
		
		String oldDateString = "12/08/2024";
		String newDateString;
		
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d = sdf.parse(oldDateString);//Converting String to Date
		
		sdf.applyPattern(NEW_FORMAT);//Apply Pattern 
		
		newDateString = sdf.format(d);//Formatting
		
		System.out.println("old Date : " + oldDateString);
		System.out.println("new Date : " + newDateString);

	}

}
