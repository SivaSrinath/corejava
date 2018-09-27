package com.string.operations;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "a"; String s2= "a";
		String s3=new String("a");
		String s4= new String("a");
		
		StringBuffer sb1= new StringBuffer("a");
		StringBuffer sb2= new StringBuffer("a");
		//== compares the object reference
		System.out.println("s1==s2"+s1==s2);
		System.out.println("s3==s4" +s3==s4);
		System.out.println( sb1==sb2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));
		
		System.out.println("*******************");
		String s5="a"; String s6="A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println("*******************");
		
		ExampleEquals e1= new ExampleEquals(5);
		ExampleEquals e2= new ExampleEquals(5);
		ExampleEquals e3= new ExampleEquals(6);
		ExampleEquals e4= e3;
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
		System.out.println();
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		
		System.out.println("sample equals");
		
		SampleEqual s11 = new SampleEqual();
		//System.out.println(e1==s11);	
		System.out.println(e1.equals("siva"));
		System.out.println(s11.equals(e1));
		System.out.println(s11==null);
		System.out.println(s11.equals(null));
		
		System.out.println(e1==null);
		System.out.println(e1.equals(null));
		
		
	}

}