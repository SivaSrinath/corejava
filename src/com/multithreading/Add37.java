package com.multithreading;

public class Add37 {

	static int x, y;
	// void add(int x, int y) {
	// synchronized void add(int x, int y){a

	//static void add(int x, int y) {
	 static synchronized void add(int x, int y){
		//this.x = x;
		//this.y = y;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int res = x + y;
		//int res = this.x + this.y;
		System.out.println("In :" + Thread.currentThread().getName() + "  result :" + res);
	}
}