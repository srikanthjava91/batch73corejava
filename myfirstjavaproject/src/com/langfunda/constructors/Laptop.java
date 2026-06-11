package com.langfunda.constructors;

public class Laptop {

	String model;
	double price;
	String brand;
	String color;

	public Laptop(String brand, String model) {
		System.out.println("Two arg constructor called ");
		this.brand = brand;
		this.model = model;
	}

	public Laptop() {
		model = "unknown";
		price = 10000.00;
		brand = "unknown";
		color = "unknown";
	}

	public static void main(String[] args) {

		Laptop l1 = new Laptop();
		l1.lapInfo();

		Laptop l2 = new Laptop("Dell", "Intel Graphics");
		l2.lapInfo();

	}

	void lapInfo() {
		System.out.println("Brand of the Laptop : " + brand);
		System.out.println("Model of the Laptop : " + model);
		System.out.println("Price of the Laptop : " + price);
		System.out.println("Color of the Laptop : " + color);
	}

}
