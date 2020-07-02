package com.abstraction;

public abstract class Example {

	abstract void m1();
	
	static int a=10;
	int x=20;
	
	static {
		System.out.println("static block");
		
	}
	
	{
		System.out.println("nsb");
	}
	
	Example(){
		System.out.println("example constructor");
	}
	
	static void m2() {
		System.out.println("static method m2");
	}
	
	void m3() {
		System.out.println("non-static method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am in main method");
		m2();		
		
		//Example ex=new Example(){{};
		

	}

}
