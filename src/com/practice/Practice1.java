package com.practice;

public class Practice1 {
	static {
		System.out.println("sample praci1- class is loaded");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("main execution");
		Practice p=new Practice();
		
		Class.forName("com.practice.Practice");
	}
}