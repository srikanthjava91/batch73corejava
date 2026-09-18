package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestLaptopDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(60);
		list.add(80);
		list.add(150);
		list.add(70);
		Collections.sort(list);
		System.out.println(list);

		System.out.println("-------------------------");

		Laptop l1 = new Laptop("Intel Graphics", "Dell", 100000.00);
		Laptop l2 = new Laptop("Thinkpad", "Lenovo", 60000.00);
		Laptop l3 = new Laptop("Pavilian", "HP", 80000.00);
		Laptop l4 = new Laptop("MacBook", "Mac", 150000.00);
		Laptop l5 = new Laptop("VIVO-Book", "ASUS", 70000.00);

		List<Laptop> laptopList = new ArrayList<>();

		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		laptopList.add(l4);
		laptopList.add(l5);
		
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Laptop>)
		Collections.sort(laptopList);

		for (Laptop l : laptopList) {
			System.out.println(l);
		}

	}

}
