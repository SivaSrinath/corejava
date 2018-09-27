package com.wrapper;

public class Pdt2Pso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "10"; System.out.println("s1"+ s1);
		String s2= Integer.toString(10); System.out.println("s2 :"+ s2);
		
		//String s4= Byte.toString(); 
		
		String s5 = Byte.toString((byte)10);	System.out.println("s5 :"+ s5);
		String s6 = Integer.toString('a');	System.out.println("s6 :"+ s6);
		//String s7 = Integer.toString("a");	System.out.println("s7 :"+ s7);
		String s8 = Double.toString(10.0);	System.out.println("s8 :"+ s8);
		
		String s9 = Float.toString(20);	System.out.println("s9 :"+ s9);
		String s10 = Float.toString(20L);	System.out.println("s10 :"+ s10);
		String s11 = Float.toString(20.0f);	System.out.println("s11 :"+ s11);
		String s12 = Float.toString(20.0F);	System.out.println("s12 :"+ s12);
		String s13 = Float.toString((float)20.0);	System.out.println("s13 :"+ s13);
		
		String s14 = Boolean.toString(false); 	System.out.println("s14 :"+ s14);
		String s15 = Boolean.toString(true); 	System.out.println("s15 :"+ s15);
		//String s16 = Boolean.toString((boolean)TRUE); 	System.out.println("s16 :"+ s16);
		
	}

}
