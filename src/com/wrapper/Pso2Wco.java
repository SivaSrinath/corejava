package com.wrapper;

public class Pso2Wco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer io1 = new Integer("10");
		Integer io2 = Integer.valueOf("1");
		
		Byte bo1 = Byte.valueOf("1");
		Byte bo2 = Byte.valueOf("1");
		
		Integer io3 = Integer.valueOf(20);
		Integer io4 = new Integer(5);
		//Integer io5 = new Integer("5L");
		
		//Long lo1= new Long("5L");
		Float fo1 = new Float("5");
		Float fo2 = new Float(5L);
		Float fo3 = new Float("5.4");
		Float fo4 = new Float("5.4F");
		Float fo5 = new Float("5.4D");
		//Float fo6 = new Float("a");
		//Character ch= new Character(a);
		
		System.out.println("io1" + io1);
		System.out.println("io2 "+ io2);
		System.out.println("io3 "+ io3);
		
		System.out.println("bo1"+ bo1);
		System.out.println("bo2"+ bo2);
		
		System.out.println("fo1"+ fo1);
		System.out.println("fo3"+ fo3);
		System.out.println("fo4"+ fo4);
	}

}
