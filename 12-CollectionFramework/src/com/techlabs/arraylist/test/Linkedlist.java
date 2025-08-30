package com.techlabs.arraylist.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList();
		al.add("Ashwini");
		al.add(0, "Durgesh");
		System.out.println("After invoking add(E e) method: "+al);
		al.add("Mansi");
		System.out.println("After invoking add(int index, E element) method:"+al);

		LinkedList<String> al2 = new LinkedList();
		al2.add("Aditi");
		al.addAll(al);
		System.out.println("After invoking addAll(Collection<? extends E> c)method: "+al);

		al.remove(4);
		
		
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
