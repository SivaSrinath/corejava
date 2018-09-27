package com.multithreading;

public class Test30_DeamonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonDemo30 dd= new DeamonDemo30();
		
		System.out.println("Baba countdown starts");
		
		for(int i=1; i<=5; i++) {
			System.out.println("main :"+ i);
		}

	}

}
