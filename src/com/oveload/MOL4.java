package com.oveload;

public class MOL4 {
	
	static void m1(byte b) {
		System.out.println("byte-arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//m1(50);
		m1((byte)50);
		
		byte b=50;
		m1(b);
	}

}
