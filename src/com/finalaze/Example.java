package com.finalaze;

public class Example {
	
	int x;
	static Example e;
	
	Example(int x){
		this.x=x;
	}
	
	@Override
	public void finalize() {
		System.out.println(("in finalize"));
		e=this; // converting unreferenced object as referenced object
				//now gc cannot destroy this object
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Example e1= new Example(10);
		System.out.println(e1);
		System.out.println(e);
		
		//unreferencing object
		e1= null;
		
		//requesting JVM to execute GC
		System.gc();
		
		//pausing main method to allow gc to execute
		Thread.sleep(100);
		
		System.out.println(e1);
		System.out.println(e);

	}

}
