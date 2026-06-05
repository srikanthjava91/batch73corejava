package com.langfunda.methods;

//Object is created in this program with the help of JVM, Before Loading anything, 
//From Java 25 onwards JVM is creating Object implicitly.
//With arguments but no return type 
public class ATMTransanctions {

	double balance = 10000.00;

	static {
		System.out.println("static block called ");
	}

	{
		System.out.println("Hello intance block !!");
	}

	{
		System.out.println("Hello intance block2 !!");
	}

	void main() {
		System.out.println("Welcome to Vcube ATM Banking ! ");

		checkBalance();
		deposite(50000.00);
		withdraw(30000.00);
	}

	void checkBalance() {
		System.out.println("The Current Balance is : " + balance);
	}

	void deposite(double amount) {
		System.out.println("The Current Balance is : " + balance);
		balance = balance + amount;
		System.out.println("Tota Balance After deposite  is : " + balance);
	}

	void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance, Your current balace is " + balance);
		} else {
			balance = balance - amount;
			System.out.println("The Remianing Balance is : " + balance);
		}
	}

}
