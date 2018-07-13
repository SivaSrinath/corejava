package com.inner;

public class Example2 {
	
	static class A{
			private int y=20;
			static void m1() {
				System.out.println("I am in m1 of inner class");
			}
			void m2() {
				System.out.println("I am in m2 of inner class");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A.m1();
		A a=new A();
		System.out.println(a.y);
		a.m2();
	

	}

}
