package com.multithreading;

public class PrintNumbers20 {
	
	void print1To50() {
		for(int i=1; i<=50; i++) {
			System.out.println(i+"\t");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	void print50To1() {
		for(int i=50; i>=1; i--) {
			System.out.println(i+ "\t");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
