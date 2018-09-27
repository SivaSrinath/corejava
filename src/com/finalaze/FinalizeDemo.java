package com.finalaze;

public class FinalizeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			new Building(new Furniture());
		}
		
		//requesting jav to run gc
		System.gc();
		
		//pausing main thread allow gc to run
		Thread.sleep(1000);

	}

}
