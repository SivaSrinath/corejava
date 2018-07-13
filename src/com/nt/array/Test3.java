package com.nt.array;

public class Test3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 [] e= {new Example3(), new Example3(), new Example3(), new Example3() };
		
		Sample3.m2(e);
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].x);
			System.out.println(e[i].y); 
		}
		
	}

}
