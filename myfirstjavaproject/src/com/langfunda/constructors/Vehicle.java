package com.langfunda.constructors;

class Vehicle1 {

	public Vehicle1() {
		System.out.println("Vehicle1 Class no arg COnstructor called ");
	}

}

public class Vehicle extends Vehicle1 {
	String brand;
	String model;

	public Vehicle() {

		System.out.println("Vehicle Class no arg COnstructor called ");
	}

	public Vehicle(String brand, String model) {
		super();
		System.out.println("Two-arg constructor called form vehicle");
		this.brand = brand;
		this.model = model;
	}

	public static void main(String[] args) {
		System.out.println("main method started from vehicle !");
	}

}

class Car1 extends Vehicle {

	Car1() {

		System.out.println("no arg constructor called  from car1 ");
	}

	public static void main(String[] args) {
		System.out.println("Main mathod started from Car1 ");

		Car1 c1 = new Car1();
		System.out.println(c1.model);
		System.out.println(c1.brand);
	}
}
