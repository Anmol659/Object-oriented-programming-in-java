package com.dsa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> car= new LinkedList<String>();
		car.add("Aston Martin");
		car.add("Lamborghini");
		car.add("BMW A8");
		car.add("G-wagon");
		car.add("Rolls Royce");
		car.add("Bentley");
		car.add("Maserati");
		System.out.println(car);
		car.addFirst("Mercedes Maybach");
		car.addLast("Ferrari");
		System.out.println(car);
		
		Vector v1= new Vector();
		v1.add("Pragya");
		v1.addElement("yo");
		v1.add("Rahul");
		System.out.println(v1);
		System.out.println(v1);
		v1.get(1);
		System.out.println("Interator...");
		Iterator I= v1.iterator();   //reverse iteration not possible
		while(I.hasNext())
		{
			Object obj2= I.next();
			//set possible while iterating but remove not possible
			v1.set(1,"loves");
			System.out.println(obj2);
		}
		
		System.out.println("Back...");     
		ListIterator listit= v1.listIterator();   //reverse iteration possible
		while(listit.hasPrevious())
		{
			Object obj2= listit.previous();
			System.out.println(obj2);
		}
		
		
		
		
		
	}
}
