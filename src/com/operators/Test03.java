package com.operators;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// unary operators
		int i1= +5; System.out.println(i1);
		int i2= -5; System.out.println(i2);
		boolean b1= !true; System.out.println(b1);
		
		System.out.println();
		//binary operators
		int i4= 7&8;  System.out.println(i4);
		boolean b3= 7<8; System.out.println(b3);
		
		//ternary operator
		System.out.println(true ? "hi" : "hello");
		System.out.println(false ? "hi" : "hello");
		
		String s1= true ? "hi" : "hello";
		System.out.println("S1"+s1);
		System.out.println(""+10+20);
		System.out.println(10+""+20);
		System.out.println("a"+20);
		System.out.println("a"+true);
		System.out.println("a"+null);
		System.out.println(10+20+"");
		System.out.println(""+10+20);
		System.out.println(22/7 * 10* 10);
		System.out.println(22F/7 * 10* 10);
		System.out.println(220/7 * 10* 10);
		System.out.println();
		System.out.println(22/7   );
		System.out.println(22F/7);
		System.out.println();
		System.out.println(-1.0);
		System.out.println();
		System.out.println(10%5);
		System.out.println(10/3);
		
		

	}

}
