package com.exception.exc;

import java.io.IOException;
import java.util.Scanner;

public class Divistion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a;
			while (true) {
				try {
					System.out.println("\n Enter first number");
					a = Integer.parseInt(sc.nextLine());
					break;
				} catch (NumberFormatException nfe) {
					System.out.println("Enter only integer");
				}
			}
			while (true) {
				try {
					System.out.println("\n enter second number");
					int b = Integer.parseInt(sc.nextLine());
					try {
						int c = a / b;
						System.out.println("result :" + c);
						break;
					} catch (ArithmeticException ae) {
						System.out.println("do not pass zero");
					}
				} catch (NumberFormatException nfe) {
					System.out.println("Enter only integer");
				}
			}

		} 
		catch (NumberFormatException ioe) {
			ioe.printStackTrace();
		}
	}
}
