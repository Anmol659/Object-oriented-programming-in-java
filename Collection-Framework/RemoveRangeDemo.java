package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class RemoveRangeDemo extends ArrayList{

	public static void main(String[] args) {
		RemoveRangeDemo rd= new RemoveRangeDemo();
		rd.add(1);
		rd.add(2);
		rd.add(3);
		rd.add(4);
		rd.add(5);
		rd.removeRange(0, 4);
		System.out.println(rd);
		ArrayList list1= new ArrayList();
		list1.add(34);
		list1.add(35);
		list1.add(36);
		list1.add(37);
		list1.add(38);
		Object all[]= list1.toArray();
		for(Object a : all)
		{
			System.out.println(a);
		}
		System.out.println(list1.indexOf(34));
		System.out.println(list1.lastIndexOf(314));
		List sublist= list1.subList(0, 3);
		System.out.println(sublist);
	}
}
