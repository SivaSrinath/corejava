package com.inner;

public class Example {

	static int a = 10;
	int x = 20;
	private int y=30;

	static class A {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println(a);
			//System.out.println(x);
			//System.out.println(y);
			
			Example e= new Example();
			System.out.println(e.a);
			System.out.println(e.x);
			System.out.println(e.y);
			
		}

	}

}
