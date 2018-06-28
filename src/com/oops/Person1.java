package com.oops; 

public class Person1 {
	
	private String name="sirisetti";
	private int age=20;
	
	Person1(){
		System.out.println("i am constructor");
	}
	Person1(int a){
		System.out.println(a);
	}
	public Person1(String s, int i){
		name=s;
		age=i;
		
	}
	
	void talk(){
		System.out.println("hell i am "+name);
		System.out.println("my age is "+age);
	}

}
