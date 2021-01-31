package com.polymorphism;

public class Poly {
	
	public void sum(int a, int b){
		System.out.println("sum is in poly sum(int a, int b)::"+(a+b) );
	}
	
	public void sum(int a, double b){
		System.out.println("sum is from poly sum(int a, double b)::"+(a+b));
	}
	
	public void m1() {
		System.out.println("I am in poly class m1 method");
	}

}
