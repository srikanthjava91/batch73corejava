package com.logicalstatements;

import java.util.Scanner;

//Nested switch Case 
//Simple POC Which is related to Vegetable Market information ..?  
public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category ");

		String catg = sc.next();// veg fru

		switch (catg) {

		case "veg" -> {
			System.out.println("Enter vegetable Item : ");
			String item = sc.next();

			switch (item) {

			case "tmt" -> System.out.println("Tomato and the price is 50rs per kg");
			case "ptt" -> System.out.println("Potato and the price is 60rs per kg");
			case "drm" -> System.out.println("Drumsticks and the price is 20rs per peice");
			case "mrc" -> System.out.println("Mirchi and the price is 40rs per Kg");
			default -> System.out.println("Entered Item is Out of Stock !");

			}

		}

		case "fru" -> {
			System.out.println("Enter fruit item :");
			String item = sc.next();

			switch (item) {

			case "mng" -> System.out.println("Mango per kg is 80/-");
			case "orn" -> System.out.println("Orange per kg is 60/-");
			case "gau" -> System.out.println("Gauva per kg is 100/-");
			case "app" -> System.out.println("Apple per kg is 300/-");
			default -> System.out.println("Entered Item is Out of Stock !");
			}
		}

		default -> System.out.println("Entered Category is not availble !!");

		}

	}

}
