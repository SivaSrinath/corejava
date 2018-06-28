package com.fact;

import java.text.NumberFormat;

public class FactMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI= 22/7; 
		double r=15.5;
		double area =PI*r*r;
		System.out.println("Area is "+area);
		
		//create numberformat class object
		
		NumberFormat obj= NumberFormat.getNumberInstance();
		
		//store the format information into object;
		
		obj.setMaximumFractionDigits(1);
		obj.setMinimumIntegerDigits(4);
		
		
		String str=obj.format(area);
		
		System.out.println("area is ::"+str);

	}

}
