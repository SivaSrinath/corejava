package com.extend;

public class Example {
	
	static int a =m1();
	static {
		System.out.println("Exmaple SB");
	}
	
	int x=m2();
	{
		System.out.println("Example NSB");
		
	}
	Example(){
		System.out.println("Example constructor");
	}
	static int m1() {
		System.out.println("Example sv is created");
		return 10;
	}
	int m2() {
		System.out.println(" Exmaple nsv is created");
		return 20;
	}
	
	void abc() {
		System.out.println("Example abc");
	}
	void bbc() {
		System.out.println("Example bbc");
	}
	
	
	

}
