package com.logical;

public class IncrementDemo {
	public static void main(String[] args) {

		int i = 0;

		System.out.println(i++ - i-- + i++ - i-- +i++);
		// i++;
		System.out.println(i++);
		// ++i;
		System.out.println(++i);

		int a = 0;
		String b = null;

		if (a == 1 && b.length() == 1) {
			System.out.println("Sigle ambersent demo");
		}

		if (a == 0 || b.length() == 1) {
			System.out.println("Sigle ambersent demo");
		}
		// short hand coding
		int c = 10;

		c = c+20;
		
		c = +10;

	}
}
