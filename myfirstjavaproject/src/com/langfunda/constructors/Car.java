package com.langfunda.constructors;

public class Car {

	String brand;
	String model;
	int year;
	String color;
	double price;

	Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	Car() {
		System.out.println("no arg constructor called ");
	}

	public static void main(String[] args) {

		Car c1 = new Car("Kia", "Sonet");
		c1.carInfo();

		Car c2 = new Car();
		c2.carInfo();

	}

	void carInfo() {
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Model of the Car : " + model);
		System.out.println("Price of the Car : " + price);
		System.out.println("Color of the Car : " + color);
		System.out.println("Year of the Car : " + year);
	}

}
