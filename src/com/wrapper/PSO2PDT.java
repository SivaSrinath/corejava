package com.wrapper;

public class PSO2PDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1= Integer.parseInt("10");
		//int i2= Integer.parseInt("10.0");
		
		System.out.println("i1 :"+ i1);
		//System.out.println("i2 :"+ i2);
		
		float f1= Float.valueOf("10");  System.out.println("f1: "+ f1);
		float f2= Float.parseFloat("150.456");  System.out.println("f2: "+ f2);
		float f3= Float.parseFloat("100.89F");  System.out.println("f3: "+ f3);
		
		boolean bo1 = Boolean.valueOf("TRUE"); System.out.println("bo1 :"+ bo1);
		boolean bo2 = Boolean.parseBoolean("FALSE"); System.out.println("bo2 :"+ bo2);
		boolean bo3 = Boolean.parseBoolean("siva"); System.out.println("bo3 :"+ bo3);
		boolean bo4 = Boolean.parseBoolean("TURE"); System.out.println("bo4 :"+ bo4);

		
		System.out.println("5.wco to String object converstion");
		Integer io = new Integer(300);	System.out.println(io);
		String s= io.toString();		System.out.println(s);
		
	}
}
