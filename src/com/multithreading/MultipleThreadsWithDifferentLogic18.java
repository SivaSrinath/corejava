package com.multithreading;

public class MultipleThreadsWithDifferentLogic18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main started");
		
		AddThread18 add = new AddThread18(); 
		add.start();
		
		SubThread18 sub = new SubThread18();
		sub.start();
		
		System.out.println("main end");
	}

}
