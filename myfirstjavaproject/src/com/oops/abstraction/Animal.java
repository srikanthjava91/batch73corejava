package com.oops.abstraction;

public interface Animal {

	public static void main(String[] args) {
		System.out.println("Welcome to interface static methods ");
		breath();
	}

	public abstract void eat();

	void sleep();

	void sound();

//	default methods :  is to avoid backward Compatibility  
//	& to provide generic behavior(utility) for all the classes.
//	If any class want to change the behavior can override the default methods.
	public default void walk() {
		System.out.println("Every animal can walk !");
		hello();
	}

//	 Yes we can create any number of default methods.
	public default void run() {
		System.out.println("Animals can also run !!");
		hello();

	}

//	static methods : To provide constant behavior for all the classes 
//	and static methods should not overridden or we cannot override..
	public static void breath() {
		System.out.println("Every animal should breath to survive !!");
	}

//	private methods introduced to provide code re-usabilty for default methods. 
//	We cannot Override private methods from parent to child.
	private static void hello() {

		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}

}
