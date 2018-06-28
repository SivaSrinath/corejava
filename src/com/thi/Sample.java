package com.thi;

public class Sample {
	
	private int x;
	
	
	Sample(){
		
		this(55);//call present class para construcotr and send 55
	System.out.println("first constu x"+x);
		this.access();
	}

	Sample(int a){
		this.x=a;
	}

	void access(){
		System.out.println(" method x= "+x);
	}
		
		
	

}
