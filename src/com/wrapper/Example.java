package com.wrapper;

public class Example {
	
	static void m1(int a) {
		System.out.println("int arg"+ a);
	}
	
	static void m1(Integer a) {
		System.out.println("Integer-arg  :"+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		//m1(new Long(70));

	}

}
