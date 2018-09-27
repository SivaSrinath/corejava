package com.operators;

public class Test16_BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println(m1() | m2());

	}

	static boolean m1() {
		System.out.println("from m1");
		return false;
	}
	static boolean m2() {
		System.out.println("from m2");
		return true;
	}
}
