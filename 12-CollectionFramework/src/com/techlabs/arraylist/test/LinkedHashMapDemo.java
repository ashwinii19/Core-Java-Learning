package com.techlabs.arraylist.test;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
		// Add key value pair
		linkedhashmap.put(101, "Ashwini");
		linkedhashmap.put(102, "Durgesh");
		// Adds key-value pair only if the key is not already present
//		linkedhashmap.putIfAbsent(103, "Jayesh");
		
//		linkedhashmap.put(null, "Yash");

		System.out.println(linkedhashmap);

//		// Returns the value if key not found null
//		System.out.println(linkedhashmap.get(101));
//
//		// Removes the key value pair
//		System.out.println(linkedhashmap.remove(104, "Yash"));
//
//		// Returns true if the map contains the value
//		System.out.println(linkedhashmap.containsValue("Yash"));
//
//		// Returns true if the map contains the value
//		System.out.println(linkedhashmap.containsKey(101));
//
//		// Returns the number of key value
//		System.out.println(linkedhashmap.size());
//
//		// Return true if the map is empty
//		System.out.println(linkedhashmap.isEmpty());
//
//		// Returns a set view of ALL KEY
//		System.out.println(linkedhashmap.keySet());
//		
//		//Returns a collection view of all values
//		linkedhashmap.values();

		Hashtable<Integer, String> linkedhashmap2 = new Hashtable<>();
		linkedhashmap2.put(101, "Ashwini");
		linkedhashmap2.put(102, "Durgesh");
		//Compare if the table is equal to another map
		System.out.println(linkedhashmap.equals(linkedhashmap2));
		
//		//Replaces value if key exits
//		linkedhashmap.replace(101,"dagale");
		
		//Replaces only if currently mapped to old values
		linkedhashmap.replace(101, "Ashwini", "Hello");

//		// Removes key-value pair
//		System.out.println(linkedhashmap.remove(103));
		System.out.println(linkedhashmap);
//		
//		// Removes all key value pair
//		linkedhashmap.clear();

	}
}
