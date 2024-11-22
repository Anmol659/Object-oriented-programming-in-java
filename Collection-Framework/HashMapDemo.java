package com.dsa;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		map.put(23,"ad");
		map.put("null",23); 
		map.put(true,45);
		map.put(false,"abc");
		System.out.println(map);
		System.out.println(map.get("null"));   //to get value of null
		
		HashMap<String, Integer> map1= new HashMap<String,Integer>();
		map1.put("Ankit",45);
		map1.put("Rahul",97);
		map1.put("Pragya",98);
		map1.put("Prity",67);
		System.out.println(map1);
		
		Set set1= map1.keySet();
		System.out.println(set1);
		
		
	}
}
