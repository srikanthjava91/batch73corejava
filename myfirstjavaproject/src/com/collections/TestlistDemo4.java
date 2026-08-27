package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestlistDemo4 {

	public static void main(String[] args) {
		System.out.println("mian method started ");

		List<String> fruits = new ArrayList<>();

		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		System.out.println(fruits);

		List<String> vegetables = new ArrayList<>();

		vegetables.add("Tomato");
		vegetables.add("Potato");
		vegetables.add("Chilli");
		vegetables.add("Banana");

		System.out.println(vegetables);

///		Retains only the elements in this list that are contained in the specified collection 
		fruits.retainAll(vegetables);
		System.out.println(fruits);

	}
}
