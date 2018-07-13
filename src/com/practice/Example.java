package com.practice;

public class Example extends Test {

	int x = 20;
	int y = 20;

	void m1() {
		int x = 30;
		System.out.println(this.x);// 20
		System.out.println(x);// 30
	}

	static int a;

	static public final void m2() {

		System.out.println(a++);
		if (a == 10) {
			// System.exit(1);
		} else {
			m2();
		}
	}

	Example() {
		super();
		System.out.println("Examplel:"+this);
	}

	public static void main(String[] args) {
	//	m2();
		Example e = new Example();
	}

}
