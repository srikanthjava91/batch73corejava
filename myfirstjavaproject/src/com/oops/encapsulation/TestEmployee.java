package com.oops.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		System.out.println("main method started ");
//		Accessing the data directly from outside of the classes 
		Employee emp1 = new Employee();

//		Modifying the data with the help of Setter 
		emp1.setId(18);
		emp1.setName("Virat Kohli");
		emp1.setSalary(-500);

//		Reading the data with the help of Getters
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());

//		Re-Initalizing the data, Without knowing your Employee class.
//		emp1.id = 18;
//		emp1.name = "Virat";
//		emp1.salary = 1800000.00;

//		Representing the data  
//		System.out.println(emp1.id);
//		System.out.println(emp1.name);
//		System.out.println(emp1.salary);

		System.out.println("main method ended ");

	}

}
