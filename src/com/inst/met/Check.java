package com.inst.met;

public class Check {

	void swap(Employee x){
		int temp;
		temp=x.id1;
		x.id1=x.id2;
		x.id2=temp;
		System.out.println("id1 value is\t"+ x.id1+" id2 value is \t"+x.id2);
	}

}