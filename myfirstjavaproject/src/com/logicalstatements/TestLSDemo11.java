package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Week day  ");
		String day = sc.next();

		getDayInfo(day);

	}

	static String getDayInfo(String day) {

		String info = switch (day) {

		case "Monday" -> {
			System.out.println("Mondays are always Lazy days  ");
			yield "Lazy day";
		}
			
		case "Tuesday", "Wednesday", "Thurday" -> "Active days";
		case "Friday" -> "Weekend Started";
		case "Saturday" -> "Funny day";
		case "Sunday" -> "Relax Mode";
		default -> "invalid day";

		};

		return info;

	}

}
