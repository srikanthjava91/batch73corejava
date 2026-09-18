package com.collections;

import java.util.Enumeration;
import java.util.Vector;


//Vector will consider as Legacy class means Old class 
public class TestVectorDemo1 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.addElement(30);
		v.addElement(50);

		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.addElement(30);
		v.addElement(50);

		v.add(null);
		v.add(null);
		
//		Enumeration is also a cursor to get the Object elements one after another 
//		Enumeration can work only for old classes like Vector & Stack 
		Enumeration<Integer> enm =v.elements();		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}

//		Iterator is Universal cursor, can work for Any Collection object.
//		Iterator<Integer> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println(v);

	}

}
