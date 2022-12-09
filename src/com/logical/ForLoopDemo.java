package com.logical;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many integers :");
		
		int size= Integer.parseInt(sc.nextLine());
		
		int data[]= new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter data in "+i+"position");
			data[i] =Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("reading data over");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]+" ");
		}
	}
	
	public static void test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers :");
		
		int size = Integer.parseInt(sc.nextLine());
		
		int data[] = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter data in "+ i+"position");
			data[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}