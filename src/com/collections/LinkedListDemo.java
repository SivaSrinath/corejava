package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("srinath");
		l.add(20);
		l.add(null);
		System.out.println(l);
		l.add(0,"chinna");
		l.set(0,"pedda");
		l.addFirst("aaa");
		l.addLast("zzz");
		System.out.println(l);

	}

}
