package com.techlabs.arraylist.test;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<>();
		//Add key value pair
		hashmap.put(101, "Ashwini");
		hashmap.put(102, "Durgesh");
		//Adds key-value pair only if the key is not already present
		hashmap.putIfAbsent(103, "Jayesh");
		hashmap.put(104, "Yash");
		
		System.out.println(hashmap);
		
		//Returns the value if key not found null
		System.out.println(hashmap.get(101));
		
		//Removes the key value pair
		System.out.println(hashmap.remove(104, "Yash"));
		
		//Returns true if the map contains the value
		System.out.println(hashmap.containsValue("Yash"));
		
		//Returns true if the map contains the value
		System.out.println(hashmap.containsKey(101));
		
		//Returns the number of key value
		System.out.println(hashmap.size());
		
		//Return true if the map is empty
		System.out.println(hashmap.isEmpty());
		
		//Returns a set view of ALL KEY
		System.out.println(hashmap.keySet());
		
		//Removes all key value pair
		hashmap.clear();
		
		//Removes key-value pair
		System.out.println(hashmap.remove(103));
		System.out.println(hashmap);
		
	}
}
