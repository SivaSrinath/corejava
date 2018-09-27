package com.string.operations;

import java.util.Scanner;

public class LengthTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="";
		String s2= " ";
		String s3= "a";
		String s4= new String();
		String s5= new String("");
		String s6= new String(" ");
		String s7= new String("a");
		
		System.out.println("is s1 length :" + s1.length());
		System.out.println("is s2 length :" + s2.length());
		System.out.println("is s3 length:" + s3.length());
		System.out.println("is s4 length :" + s4.length());
		System.out.println("is s5 length :" + s5.length());
		System.out.println("is s6 length :" + s6.length());
		System.out.println("is s7 length :" + s7.length());
		
		String s8= null;
		//System.out.println("is s8 length :" + s8.length());
		
		String s9= "null";
		System.out.println("is s9 length :" + s9.length());
		
		String s10;
		//System.out.println("is s10 length :" + s10.length());
		String s11="Hari";
		String[] s12= {"Hari", "Nit"};
		
		//System.out.println("s11 length is :"+ s11.length);
		System.out.println("s11 length is :"+ s11.length());
		//System.out.println("s11 length is :"+ s12.length());
		System.out.println("s11 length is :"+ s12.length);
		
		Scanner scn= new Scanner(System.in);
		System.out.println("\n Enter string1:");		
		System.out.println("you entered"+scn.nextLine().length()+"characters");
		
		System.out.println("\n Enter string2:");		
		System.out.println("you entered"+scn.nextLine().length()+"characters");
		
		
		System.out.println("\n enter String2:");
		System.out.println(scn.nextLine().isEmpty());
		
		System.out.println("\n enter String3:");
		System.out.println(scn.nextLine().isEmpty());


	}

}
