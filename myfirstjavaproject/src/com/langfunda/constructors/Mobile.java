package com.langfunda.constructors;

//Parent or Super or Base 
class Product {

	String name = "Unknown";
	String brand = "Unknown";
	double price = 0.0;
	String orgname = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started from Product ");
	}

}

//Child or Sub or Derived 
public class Mobile extends Product {
	String name = "10R";
	String brand = "One Plus";
	double price = 40000.00;
	String orgname = "Srikanth";

	public static void main(String[] args) {
		System.out.println("main method started from Mobile ");

		Mobile m = new Mobile();
		m.mobileInfo();

		//Cannot use this in a static context
//		System.out.println(this.name);
	}

	//this & super keyword we can use in inside instance area only 
//	like instance methods or instance blocks or constructors.
	void mobileInfo() {
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(super.orgname);
	}

}
