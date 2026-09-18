package com.collections;

public class Mobile {

	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

	public Mobile(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
}
