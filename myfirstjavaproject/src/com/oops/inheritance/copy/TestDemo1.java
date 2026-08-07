package com.oops.inheritance.copy;

import java.util.ArrayList;

class Customer {
	int cid;
	String cname;

	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}

}

public class TestDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		System.out.println(al);
		System.out.println(al.hashCode());

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(100);
		al1.add(200);
		System.out.println(al1);
		System.out.println(al1.hashCode());
		System.out.println(al.equals(al1));
		System.out.println("---------------------------------");

		Customer c1 = new Customer(101, "Srikanth");
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1);

		Customer c2 = new Customer(101, "Srikanth");
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2);

		Customer c3 = new Customer(0, null);
		c3 = c2;
		
		System.gc();

//		true if this object is the same as the obj argument; false otherwise.
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());

		System.out.println(c3 == c2);
		System.out.println(c3.equals(c2));

		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

	}

}
