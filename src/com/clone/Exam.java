package com.clone;

public class Exam implements Cloneable {

	int x=10, y=20;
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		Exam e1= new Exam();
		e1.x=5;
		e1.y=6;
		
		Exam e2= (Exam)e1.clone();
		System.out.println(e1==e2);
		System.out.println(e1.hashCode()== e2.hashCode());
		
		System.out.println(e1.x+"....."+e1.y);
		System.out.println(e2.x+"...."+e2.y);
		
		e2.x=8;
		e2.y=9;
		
		System.out.println();
		System.out.println(e1.x+"....."+ e1.y);
		System.out.println(e2.x+"..."+e2.y);
	}

}
