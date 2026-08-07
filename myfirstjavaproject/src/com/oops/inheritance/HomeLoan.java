package com.oops.inheritance;

//Child or sub or Derived 
public class HomeLoan extends LoanImpl {

	void homeLoanDocinfo() {
		System.out.println("Home Loan documents have beeen received successfully !!");
	}

//	Method Overriding Rule 
//	1) Method signature must be same.
//	Note : Method signature means method name + parameters but not return type.

//	2) Method return type must be same until 1.4 version.
//	Note : From 1.5 version Java Introduced co-varient return types.

//	Even though from 1.5 version, 
//		- If the Parent class method return type is Primitive data types, 
//	then the child class method return type must be same primitive data type.

//	 But, - If the Parent class method return type is Object data types, 
//	then the child class method return type can be same or co-varient return types.

//	What is co-varient return types..? 
//	If The Parent class method return type is Object type, 
//	then the child class method return type can be same object type or 
//	it's sub type is the process of co-varient return types.

//	ex: P --> Number --> C--> Number/Integer/Double/.......
//	ex: P --> String --> C --> String 
//	ex: P --> Object --> C --> Object / String any java object

//	3) Method scope Should not reduced.(Note : Cannot reduce the visibility of the inherited method from Loan)
//	Note : If the 
//		Parent class method is public --> Child class method must be the public.
//		Parent class method is protected --> Child class method must be the protected or public.
//	    Parent class method is default --> Child class method can be <default> or protected or public.
//	    Parent class method is private --> child class cannot override private methods.
//	

//	4) private methods we cannot override.
//	Note : If the parent class method is private, the same method 
//	we can write inside the child class without @override annotation.
//	If we give @Override annotation we will get Compile time error.

//	5) static method we cannot override.
//	Note : static methods loads whenever the class loads,
//	But Method Overriding is Working based on Objects and with Dynamic behavior, 
//	So we cannot consider static methods for Method Overriding but we can consider this as Method Hiding.
//	
//	6) final methods we cannot override.
//	If the Parent class method is final, we cannot override it into child class.
//	the final keyword behavior itself stopping the the Overriding from Parent to child.
//	Can we call final methods in Child classes ..? Yes but we cannot override.
//	If the class is final, all methods from that class are also final.
//	If the class is final, all variables from that class are not final.

//	Related Exceptions 
//	7) If the Parent class method throws any Exception, 
//	the child class Overridden method no need to throws any exceptions
//	but, If The child class method throws any Exception
//	The Parent class must throws same Exception or it's Parent Exception.

//	abstract methods
//	8) If the Parent Type(interface or class) is abstract and the type contains abstract methods
//	the child class must Override the abstract methods with implementation.

//	If the Parent is Normal class and contains normal methods and the child class is abstract 
//	Can we override normal methods from parent to  child as abstract methods  ..? Yes

	private int add() {
		return 5;
	}

	@Override
	public double getROI() {
		double roi = 9.0;
		return roi;
	}

	public static void main(String[] pars) {
		System.out.println("Welcome to Vcube Home Loan Banking Loan !!");

		String s1 = new String();
		System.out.println(s1);

		Loan pl = new HomeLoan();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();

		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Wlecome to Vcube Home Loan Banking Mr : " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();

			if (salary >= 600000.00 && (age >= 20 && age <= 45) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratualtions !! You are Eligible for Home Loan !!");
				System.out.println("Your Rate of Interest is : " + pl.getROI());

			} else {
				System.out.println("Focus on your Career to get Loans !!");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}
