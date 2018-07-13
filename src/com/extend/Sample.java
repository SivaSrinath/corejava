package com.extend;

public class Sample extends Example{

	static int b=m3();
	static {
		System.out.println("sample sb");
	}
	
	int y=m4();
	{
		System.out.println("sample nsb");
	}
	
	Sample(){
		System.out.println("sample constructor");
	}
	static int m3() {
		System.out.println("sample sv is created");
		return 30;
	}
	
	int m4() {
		System.out.println("sample nsv is created");
		return 40;
	}
	void abc() {
		System.out.println("sample abc");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("i am in main");
		Sample s= new Sample();
		
		s.abc();
		s.bbc();
	}

}
