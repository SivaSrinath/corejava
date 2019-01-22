package com.hashcode;

public class IdentityHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExampleOver e1= new ExampleOver(5);
		ExampleOver e2= new ExampleOver(6);
		ExampleOver e3= new ExampleOver(6);
		
		IdentityHashCodeTest ID= new IdentityHashCodeTest();
		System.out.println(ID.hashCode());
		System.out.println(System.identityHashCode(ID));
		
		System.out.println();

		System.out.println("hashcode");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println();
		//Object.equals(){
			
		
		System.out.println("identity hashcode");
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		
		System.out.println("jvmc");
		System.out.println(e1.JVMHC());
		System.out.println(e2.JVMHC());
		System.out.println(e3.JVMHC());
	}
}