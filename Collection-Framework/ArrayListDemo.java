package com.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list1= new ArrayList();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);
		System.out.println(list1);
		int len= list1.size();
		System.out.println("Length "+len);
		ArrayList list2= new ArrayList();
		list2.add(31);
		list2.add(32);
		list2.add(33);
		list2.add(34);
		list2.add(35);
		list2.add(36);
		System.out.println(list2);
		list2.add(2,100);
		System.out.println(list2);
//		list1.add(list2);
//		System.out.println(list1);
		list1.addAll(list2);
		System.out.println(list1);
		ArrayList list3= new ArrayList();
		list3.add(1);
		list3.add(null);
		list3.add('c');
		list3.add("GSV");
		list3.add(true);
		list3.add(36.4);
		list3.add(3.4f);
		System.out.println(list3);
		list3.addAll(list1);
		System.out.println(list3);
		Object obj= list3.get(1);
		System.out.println(obj);
		for(int i=0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		System.out.println("before set");
		System.out.println(list3);
		list3.set(3, 40);  //to replace at index
		System.out.println(list3);
		
		for(int i=0;i<list3.size();i++)
		{
			Object obj1= list3.get(i);
			
			if(obj1 instanceof Integer)
			{
				System.out.println("Before"+obj1);
				Integer i1= (Integer)obj1;
				System.out.println("Integer :"+i1);
			}
			if(obj1 instanceof Float)
			{
				System.out.println("Before"+obj1);
				Float f1= (Float)obj1;
				System.out.println("Float :"+f1);
			}
			if(obj1 instanceof Boolean)
			{
				System.out.println("Before"+obj1);
				Boolean b1= (Boolean)obj1;
				System.out.println("Boolean :"+b1);
			}
			if(obj1 instanceof Double)
			{
				System.out.println("Before"+obj1);
				Double d1= (Double)obj1;
				System.out.println("Double :"+d1);
			}
			if(obj1 instanceof String)
			{
				System.out.println("Before"+obj1);
				String s1= (String)obj1;
				System.out.println("String :"+s1);
			}
		}
		
		//iterator
		System.out.println("Interator...");
		Iterator it= list3.iterator();   //reverse iteration not possible
		while(it.hasNext())
		{
			Object obj2= it.next();
			//set possible while iterating but remove not possible
			list3.set(3,4000);
			System.out.println(obj2);
		}
		
		System.out.println("Back...");     
		ListIterator listit= list3.listIterator();   //reverse iteration possible
		while(listit.hasPrevious())
		{
			Object obj2= listit.previous();
			System.out.println(obj2);
		}
		
		list3.addFirst("ABC");
		System.out.println(list3);
		
		ArrayList<Integer> inte= new ArrayList<Integer>();  //generic array
		inte.add(1);
		inte.add(2);
		inte.add(3);
		inte.add(4);
		inte.add(5);
		ArrayList<Integer> inte2= new ArrayList<Integer>();
		inte2.add(6);
		inte2.add(2);
		inte2.add(3);
		inte2.add(9);
		inte2.add(10);
		System.out.println("I1: "+inte);
		System.out.println("I2: "+inte2);
//		inte.remove(0);
//		inte.removeAll(inte2); //removes common from inte
//		inte.retainAll(inte2);  //keeps common element in inte
//		System.out.println(inte);
//		System.out.println(inte.containsAll(inte2)); 
		inte.addAll(inte2);
		System.out.println(inte);
		Collections.sort(inte);
		System.out.println(inte);
		System.out.println(Collections.binarySearch(inte, 4));
//		Collections.sort(list3);  //cannot sort array with multiple data types
//		System.out.println(list3);
//		System.out.println(Collections.binarySearch(list3, 4)); //cannot search array with multiple data types
        
		
		
		
		
		
		
	}
}

