package com.wrapper;

public class MethodwithWC {
	
	static void m1(Integer io) {
		System.out.println("Integer arg"+ io);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//m1((byte)50);
		//m1(new Character('a'));
		
		m1(new Integer(10));
	}

}
