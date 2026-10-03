package com.java8features.optional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		
		
		// Current date and time
        Date now = new Date();
        System.out.println("Current Date: " + now);

        // Create a specific date using milliseconds since epoch (Jan 1, 1970)
        Date past = new Date(0); // epoch start time
        System.out.println("Epoch Date: " + past);

		System.out.println("****************************");

		String oldDateString = "12/08/2024";

		DateTimeFormatter oldFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// String → LocalDate
		LocalDate date = LocalDate.parse(oldDateString, oldFormat);

		// LocalDate → String
		String newDateString = date.format(newFormat);

		System.out.println("Old Date : " + oldDateString);
		System.out.println("New Date : " + newDateString);
	}
}
