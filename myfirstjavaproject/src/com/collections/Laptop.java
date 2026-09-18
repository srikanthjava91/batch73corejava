package com.collections;

public class Laptop implements Comparable<Laptop> {

	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

	public Laptop(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {

//		if (this.price < o.price) {
//			return 1;
//		} else if (this.price > o.price) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		return -this.brand.compareTo(o.brand);
	}
}
