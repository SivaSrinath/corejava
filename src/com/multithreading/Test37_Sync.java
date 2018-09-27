package com.multithreading;

public class Test37_Sync {

	public static void main(String args[]) {
		Add37 obj= new Add37();
		new Thread137(obj).start();
		new Thread237(obj).start();
	}
}