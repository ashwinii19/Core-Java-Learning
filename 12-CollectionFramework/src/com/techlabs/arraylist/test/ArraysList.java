package com.techlabs.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		ArrayList<String> lastname = new ArrayList<String>();

		// Add element
		lastname.add("Thorat");
		lastname.add("dagale");

		list.add("Durgesh");
		list.add("Ashu");

		// Using for
//	for(String res : list) {
//		System.out.println(res);
//	}

		// Add element at second index
		list.add(2, "Pranav");

		// Add new collection to end of another collection
//		list.addAll(lastname);

//	//return all the elements from the last collection
//		list.retainAll(lastname);
//   //update the element with index element
//    list.set(0,"Ashwini");

//    //remove all the Element
//    list.clear();

		// size of list
		int Size =list.size();

		// USing Iterator
		System.out.println(Size);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.addAll(Size, lastname);

	}
}