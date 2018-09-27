package com.wrapper;

public class MethodWithPDT {
	
	static void m1(int a) {
		System.out.println("int arg :"+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1((byte)50);
		m1('a');
		m1(60);
		//m1(70L);
		//m1(80.57);
		m1(new Character('a'));

	}

}
