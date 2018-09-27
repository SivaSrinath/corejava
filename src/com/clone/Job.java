package com.clone;

public class Job implements Cloneable{
	
	//overriding clone method
	int x=10, y=20;
	public Job clone() throws CloneNotSupportedException{
		return (Job)super.clone();
	}
}