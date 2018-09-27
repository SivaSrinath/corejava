package com.hashcode;

public class ExampleOver {
	
	private int x;
	ExampleOver(int x){
		this.x=x;
	}
	
	@Override
	public int hashCode() {
		return x;
	}
	
	public int JVMHC() {
		return super.hashCode();
	}

}
