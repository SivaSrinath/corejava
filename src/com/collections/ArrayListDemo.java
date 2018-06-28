package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		
		a.add("srinath");
		a.add("10");
		a.add(new Integer(10));
		a.add(null);
		System.out.println(a);
		a.remove(2);
		a.add(2,"M");
		
		System.out.println(a);

	}

}
