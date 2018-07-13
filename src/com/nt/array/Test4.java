package com.nt.array;

public class Test4 {

	
	static Example4 e1[]= new Example4[5];
	Example4 e2[] =  {new Example4(), new Example4()};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test main");
		
		Example4[] e3= new Example4[2];
		
		System.out.println("e3 array object is created");
		
		e1[1] = new Example4();
		e3[1] = new Example4();
		
		System.out.println(e1[1].x);
		//System.out.println(e2[1].x);
		System.out.println(e3[1].x);
		
		Test4 t= new Test4();
		System.out.println("t.e2[1].x"+t.e2[1].x);
		System.out.println("e1[0].x"+t.e1[0].x);
		System.out.println("e2[0].x"+t.e2[0].x);
		
		System.out.println("e3[0].x"+e3[0].x);
		System.out.println("t.e1[1].y"+t.e1[1].y);
	}

}