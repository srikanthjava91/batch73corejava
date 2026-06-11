package com.langfunda.constructors;

public class Car {

	String brand;
	String model;
	int year;
	String color;
	double price;

	public Car(String brand, String model, String color) {
		System.out.println("3 -arg constructor called ");
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	public Car(String brand, String model, int year, String color, double price) {
		System.out.println("4 -arg constructor called ");
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	Car(String brand, String model) {
		System.out.println("2 -arg constructor called ");
		this.brand = brand;
		this.model = model;
	}

	Car() {
		System.out.println("no arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Car c1 = new Car("Kia", "Sonet");
		c1.carInfo();

		Car c2 = new Car();
		c2.carInfo();

		Car c3 = new Car("KIA", "Seltos", 2025, "White", 1500000.00);
		c3.carInfo();

		Car c4 = new Car("Tata", "Nexaon", "RED");
		c4.carInfo();

		System.out.println("main method ended ");

	}

	void carInfo() {
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Model of the Car : " + model);
		System.out.println("Price of the Car : " + price);
		System.out.println("Color of the Car : " + color);
		System.out.println("Year of the Car : " + year);
		System.out.println("----------------------------");
	}

}
