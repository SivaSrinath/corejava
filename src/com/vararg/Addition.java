package com.vararg;

public class Addition {
	
	static void add(int [] a) {
		System.out.println(a.length+"values array is passed");
		for(int i=0; i<a.length; i++) {
			System.out.println("value"+ (i+1)+ "is"+ a[i]);
		}
	}

}
