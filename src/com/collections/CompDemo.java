package com.collections;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>(new MyComp());
		
		ts.add("a");
		ts.add("c");
		ts.add("b");
		System.out.println(ts);
		
		for(String element: ts)
			System.out.println(element +" ");
		System.out.println();
		
		

	}

}
