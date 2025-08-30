package com.techlabs.arraylist.test;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> hashtable = new Hashtable<>();
		// Add key value pair
		hashtable.put(101, "Ashwini");
		hashtable.put(102, "Durgesh");
		// Adds key-value pair only if the key is not already present
//		hashtable.putIfAbsent(103, "Jayesh");
		
//		hashmap.put(null, "Yash");

		System.out.println(hashtable);

//		// Returns the value if key not found null
//		System.out.println(hashtable.get(101));
//
//		// Removes the key value pair
//		System.out.println(hashtable.remove(104, "Yash"));
//
//		// Returns true if the map contains the value
//		System.out.println(hashtable.containsValue("Yash"));
//
//		// Returns true if the map contains the value
//		System.out.println(hashtable.containsKey(101));
//
//		// Returns the number of key value
//		System.out.println(hashtable.size());
//
//		// Return true if the map is empty
//		System.out.println(hashtable.isEmpty());
//
//		// Returns a set view of ALL KEY
//		System.out.println(hashtable.keySet());
//		
//		//Returns a collection view of all values
//		hashtable.values();

		Hashtable<Integer, String> hashtable2 = new Hashtable<>();
		hashtable2.put(101, "Ashwini");
		hashtable2.put(102, "Durgesh");
		//Compare if the table is equal to another map
		System.out.println(hashtable.equals(hashtable2));
		
//		//Replaces value if key exits
//		hashtable.replace(101,"dagale");
		
		//Replaces only if currently mapped to old values
		hashtable.replace(101, "Ashwini", "Hello");

//		// Removes key-value pair
//		System.out.println(hashtable.remove(103));
		System.out.println(hashtable);
//		
//		// Removes all key value pair
//		hashtable.clear();

	}
}
