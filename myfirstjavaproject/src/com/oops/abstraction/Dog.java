package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog can eat non-veg mostly !!");
	}

	@Override
	public void sleep() {
		System.out.println("Dogs can sleep morning time and helps at night time !!");
	}

	@Override
	public void sound() {
		System.out.println("Bow  bow  !! ");
	}

}
