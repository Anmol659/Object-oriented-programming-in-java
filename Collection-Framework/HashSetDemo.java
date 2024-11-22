package com.dsa;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet set= new HashSet();  
		set.add(12);   //adding elements in the set or list
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(15);
		set.add(16);
		System.out.println(set);
		HashSet set2= new HashSet();
		set2.add(31);
		set2.add(32);
		set2.add(14);
		set2.add(54);
		set2.add(38);
		set2.add(40);
		System.out.println(set2);
		set.addAll(set2);    //addAll used to combine one list with another in a random form
		System.out.println(set);
		set2.contains(31);
		Iterator ite= set2.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		set2.remove(14);
		System.out.println(set2);
		set2.retainAll(set);
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
		
		
		
		
	}
}
