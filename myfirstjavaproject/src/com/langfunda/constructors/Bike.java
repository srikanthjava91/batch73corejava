package com.langfunda.constructors;


//4-Parameterized constructors 
//2-Parameterized constructors 
//No argument constructor 
//Constructor with Different arguments like 2-arg, 4-arg, 1-arg in one class will consider as Constructor Overloading..
public class Bike {

	String model;
	String brand;
	double price;
	int milage;

	// no arg constructor
	Bike() {
		System.out.println("No arg constructor called ");
		model = "unknown";
		brand = "unknown";
		price = 10000.00;
		milage = 100;
	}

//	this is a keyword to invoke 
//	We need to keep this keyword for a Better Readability, Maintenance & Flexibility
	Bike(String model, String brand, double price, int milage) {
		System.out.println("4 arg Parameterized constructor called ");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.milage = milage;
	}

//	Even though if we keep, different names for arguments, it works but its not Better way coding.
//	We should follow coding Ethics.Thats why arguments & instance variables must be same and we need to call with "this"
	Bike(String model, String brand) {
		System.out.println("2-arg Parameterized constructor called");
		this.model = model;
		this.brand = brand;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Bike b1 = new Bike();
		b1.bikeInfo();

		Bike b2 = new Bike();
		b2.bikeInfo();

		Bike b3 = new Bike("Classic", "RE", 300000.00, 50);
		b3.bikeInfo();// null null 0.0 0

		Bike b4 = new Bike("FZ-S", "Yamaha");
		b4.bikeInfo();

	}

	void bikeInfo() {
		System.out.println("Model of the Bike : " + model);
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Price of the Bike : " + price);
		System.out.println("Milage  of the Bike : " + milage);
		System.out.println("----------------------------------");
	}

}
