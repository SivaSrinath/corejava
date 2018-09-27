package com.collecions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		List<String> linkedList = new LinkedList();
		
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		Iterator<String> it =linkedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**************");
		ListIterator<String> lit=linkedList.listIterator();
		lit.next();
		lit.next();// cursor is at before b
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
				
	}
}
