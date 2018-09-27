package com.wrapper;

public class Example4 {
	
	static void m1(char a) {
		System.out.println("char-arg  :"+ a);
	}
	
	static void m1(Object n) {
		System.out.println("Object-arg"+ n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(70));
		m1(80.45);
		m1(true);

	}

}
