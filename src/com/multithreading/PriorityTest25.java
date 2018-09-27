package com.multithreading;

public class PriorityTest25 extends Thread {

	public void run() {
		System.out.println(getName() + "run executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityTest25 pt = new PriorityTest25();
		PriorityTest25 pt1 = new PriorityTest25();

		pt.setPriority(5);
		pt.setName("thread pt");
		pt1.setPriority(9);
		pt1.setName("thread pt1");
		pt.start();
		pt1.start();
		System.out.println("main executed");
	}
}