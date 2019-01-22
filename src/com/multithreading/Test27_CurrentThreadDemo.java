package com.multithreading;

public class Test27_CurrentThreadDemo {
	
	
	static {
		System.out.println("In SB");
		Thread th= Thread.currentThread();
		System.out.println("SB is executing in \""+th.getName()+"\"thread\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		// retrieving currently executing thread reference
		Thread th = Thread.currentThread();
		System.out.println("original name and priority of main method");
		System.out.println("current thread name :"+ th.getName());
		System.out.println("current thread priority"+ th.getPriority());
		
		th.setName("xxxx");
		th.setPriority(7);
		
		System.out.println("after modification name and priority of main method");
		System.out.println("current thread name :"+ th.getName());
		System.out.println("current thread priority"+ th.getPriority());
	}

}
