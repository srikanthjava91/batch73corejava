package com.javaintro.garbage;

//Class Object is the root of the class hierarchy.
class Employee {
	int empId;
	String empName;

//	Called by the garbage collector on an object 
//	when garbage collection determines that there are no more references to the object.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

//		 1) Nullifying the Objects
		e1 = null;

//		2) Re-assigining the Objects 
		Employee e4 = new Employee();
		System.out.println(e4);
		e4 = e2;

		System.out.println(e2);
		System.out.println(e4);

//		 Runs the garbage collector in the Java Virtual Machine.
		System.gc();

		System.out.println("main method ended ");
	}

}
