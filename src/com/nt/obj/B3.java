package com.nt.obj;

public class B3  extends A3{
	
	int y=m2();
	
	int m2() {
		System.out.println("B NSV");
		return 20;
	}
	{
		System.out.println("B NSB");
	}
	B3(){
		System.out.println("B Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("B main");
		
		B3 b= new B3();
		System.out.println("\n B main x:"+ b.x);
		
		System.out.println("\n B main y:"+ b.y);
	}

}
