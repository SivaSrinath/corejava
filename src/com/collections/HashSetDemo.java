package com.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add("a");
		h.add("c");
		h.add("d");
		
		h.add("z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("z"));
		System.out.println(h);

	}

}
