package com.multithreading;

public class SubThread18 extends Thread{
	
	int diff=0;
	public void run() {
		for(int i=1; i<=50; i++) {
			diff -=i;
			System.out.println("the sub thread :"+ diff);
		}
	}

}
