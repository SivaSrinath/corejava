package com.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		System.out.println("first"+v);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++){
			v.addElement(i);
		}
		System.out.println("after for loop"+v);
		System.out.println(v.capacity());
		v.addElement("Aa");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
