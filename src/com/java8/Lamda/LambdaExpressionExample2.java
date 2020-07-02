package com.java8.Lamda;

import com.java8.Lamda.interfac.Drawable;

public class LambdaExpressionExample2 {

	
	public static void main(String args[]) {
		int width = 10;
		
		 Drawable d2 = ()-> {
			System.out.println("width is :" + width);
		};
		
		d2.draw();
	}
}
