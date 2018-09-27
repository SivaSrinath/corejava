package com.clone;

public class Test{
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Job j1= new Job();
		Job j2= j1.clone();
		
		System.out.println(j1);
		System.out.println(j2);
		
		
		
	}

}
