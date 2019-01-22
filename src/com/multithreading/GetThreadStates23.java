package com.multithreading;

public class GetThreadStates23 extends Thread{
	
	public void run() {
		System.out.println("run start");
		System.out.println("from run method mt state after start call :"+ this.isAlive()+"||"+ this.getState());
		
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GetThreadStates23 mt= new GetThreadStates23();
		System.out.println("From main method mt state after obj creation :"+mt.isAlive()+"||"+ mt.getState());
		mt.start();
		System.out.println("From main method mt state after start call :"+ mt.isAlive()+"||"+ mt.getState());
		Thread.sleep(500);
		System.out.println("From main method mt state after mt.sleep() call :"+ mt.isAlive()+"||"+ mt.getState());
		Thread.sleep(6000);
		System.out.println("From main method mt state after run completed :"+ mt.isAlive()+"||"+ mt.getState());
	}
}