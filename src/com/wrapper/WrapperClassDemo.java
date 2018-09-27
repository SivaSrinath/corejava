package com.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.pdt to wco");
		
		int i=50;
		Integer io1= new Integer(i);
		Integer io2 = Integer.valueOf(i);
		System.out.println("pdt to wco");
		System.out.println("i: " +i);
		System.out.println("io1 "+ io1);
		System.out.println("io2 "+ io2);
		
		//Byte b= new Byte((byte)50);
		Character ch1 = new Character((char)97);
		Boolean bo = new Boolean(true);
		Float f1 = new Float(32.56f);
		Double d1 = new Double('a');
		
		System.out.println("ch1 :"+ ch1);
		System.out.println("bo :"+ bo);
		System.out.println("f1 :"+ f1);
		System.out.println("d1 :"+ d1);
		
		System.out.println("2.wco to pdt");
		
		Integer io3= Integer.valueOf(254);
		int x= io3.intValue();
		byte b= io3.byteValue();
		short s = io3.shortValue();
		float f = io3.floatValue();
		
		System.out.println("x:"+ x);
		System.out.println("b :"+ b);
		System.out.println("s :"+ s);
		System.out.println("f :"+ f);
		
		System.out.println("pso to wco");
		Integer io4= new Integer(19);

	}

}