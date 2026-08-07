package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow meow !!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat Rat !!");
	}

	@Override
	public void sleep() {
		System.out.println("cat can sleep at anytime !");
	}

}
