package com.techlabs.arraylist.test;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap <Integer,String> treemap = new TreeMap<>();
		TreeMap <Integer,String> treemap2 = new TreeMap<>();
		
		
		treemap.put(1, "Durgesh");
		treemap.put(2,"Jayesh");
		treemap.put(3, "Ashwini");
		treemap.put(4, "Yash");
		
		treemap2.put(5, "Thorat");
		treemap2.put(6,"Pingale");
		treemap2.put(7, "dagale");
		treemap2.put(8, "mali");
		
		//Add values to end of the first map
		treemap.putAll(treemap2);
		
		//give first key value pair
	//System.out.println(treemap.firstEntry());
		
		//Give the Last key just the key
		//System.out.println(treemap.lastKey());
		
		//give last key value pair
		//System.out.println(treemap.lastEntry());
		
		//give the next higherkey than the given
		//System.out.println(treemap.higherKey(2));

		//give the next lowerkey than the given
		//System.out.println(treemap.lowerKey(2));
		
		//ceiling key give greater than given key
		//System.out.println(treemap.ceilingKey(0));
		
		//give key less than the given key
		//System.out.println(treemap.floorKey(12));
		
		//give in reverse order
		//System.out.println(treemap.descendingMap());
		System.out.println(treemap);
		
	}

	
}
