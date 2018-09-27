package com.oveload;

public class MOL3 {
	
	static void m1(int a) {
		System.out.println("int-arg");
	}
	static void m1(float f) {
		System.out.println("float-arg");
	}
	/*static void m1(char c) {
		System.out.println("char-arg");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(10);
		m1('a');
		m1((int)'d');
		m1(50L);
		long L=50;
		m1(L);
		//m1(50.34);
		
	}

}
