package com.wrapper;

public class Example1 {

	static void m1(long l) {
		System.out.println("long arg"+ l);
	}
	
	static void m1(Character a) {
		System.out.println("Character-arg  :"+ a);
	}
	
	static void m1(Number n) {
		System.out.println("Number-arg"+ n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(70));
		m1(80.45);
		//m1(true);
	}

}
