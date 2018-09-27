package com.clone;

public class Example implements Cloneable{
	int x=10;
	int y=20;
	

	public static void main(String[] args)  throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		Example e1= new Example();
		Example e2= (Example)e1.clone();
		System.out.println(e2);
		System.out.println(e1);

	}

}
