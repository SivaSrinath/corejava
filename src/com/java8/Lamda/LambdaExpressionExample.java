package com.java8.Lamda;

import com.java8.Lamda.interfac.Drawable;

public class LambdaExpressionExample {
	
	public static void main(String args[]) {
		int width = 10;
		
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("width is "+ width);
			}
		};
		d.draw();
	}

}
