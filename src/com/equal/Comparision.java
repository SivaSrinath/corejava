package com.equal;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//comparing primitive values using "==" operator
		int x=10;
		int y=20;
		int z=10;
		System.out.println(x==y);
		System.out.println(x==z);
		
		//comparing objects using "==" operator
		Example e1= new Example();
		Example e2= new Example();
		Example e3= e2;
		
		System.out.println( e1==e2);
		System.out.println(e2==e3);
		//comparing objects using equals method
		
		System.out.println("e1 and e2 "+e1.equals(e2));
		System.out.println("e2 and e3 "+ e2.equals(e3));
		
		//comparing two nulls using == operator
		
		System.out.println("case 1: comapring null with other null returs true");
		
		System.out.println(null ==  null);
		System.out.println("comparing null wiht full reference variable");
		Example e4=null;
		System.out.println(null == e4);
		// comparing two nulls using equals method
		
		//System.out.println(null.equals(null));
		
		Example e6= null;
		System.out.println(e6.equals(null));
		
		Example e7= new Example();
		System.out.println(e7.equals(null));
				
	}

}
