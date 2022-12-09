package com.collecions;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {
	public static void main(String[] args) {
		// List RandomAcess insertion order allows duplicates,allows nulls
		// Vector(1.0),ArrayList,LinkedList,Stack
		// data retrieving types for, foreach, while, iterator,
		// Enumurator,ListIterator(This is only for LinkedList)

		//incremetal capacity,load factor, default capacity diff capacity and size
		Vector<Object> list = new Vector<>(1);
        System.out.println("Capacity:"+list.capacity());
        System.out.println("size:"+list.size());
		list.add(1);
		list.add("some");
		list.add(true);
		list.add('a');
		list.add('a');
		
		System.out.println("capacity :"+ list.capacity());
		System.out.println("size :"+ list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("for each loop");
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("*****Iterator**********");
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****enumeration starts*******");
		Enumeration<Object> enu = Collections.enumeration(list);
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		System.out.println("*****using streams*******");
		list.stream().forEach(l -> System.out.println(l));
		
		
	}
}