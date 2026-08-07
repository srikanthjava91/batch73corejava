package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		List<Integer> al = new ArrayList<>();
//		al.add(10);

		System.out.println("Cat info !!!!");
		Animal c = new Cat();// Abstraction with up-casting
		c.eat();
		c.sleep();
		c.sound();
		c.walk();
		c.run();

//		Generally, static methods from classes can access through object reference variables
//		& class names but static methods from interface, 
//		we cannot access through object reference variables,
//		we must call it with interface name only.
//		This static method of interface Animal can only be accessed as Animal.breath
//		c.breath();CE : 
		Animal.breath();

		System.out.println("*****************************");
		System.out.println("Dog Info !!!!!");
		Animal d = new Dog();
		d.eat();
		d.sleep();
		d.sound();
		d.walk();
		d.run();

		System.out.println("******************************");
		System.out.println("Monkey Info !!!!!");
		Animal m = new Monkey();
		m.eat();
		m.sleep();
		m.sound();
		m.walk();
		m.run();

	}
}
