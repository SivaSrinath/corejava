package com.oveload;

public class MOL2OverloadingMystery {

	public static void main(String[] bdsvf) {
		// TODO Auto-generated method stub
		
		CalleelImpl cl=new CalleelImpl();
		
		Object ob1 = new Object();
		Object ob2 = "HriKrishna";
		Object ob3 = new Integer(7279);

		cl.foo(ob1);
		cl.foo(ob2);
		cl.foo(ob3);
		
		System.out.println();
		
		cl.foo("HK");
		cl.foo((String)ob2);
		cl.foo((Integer)ob3);

		System.out.println();
		cl.foo((String)ob1);
		cl.foo((Integer)ob1);
		cl.foo((String)ob3);
		cl.foo((Integer)ob2);
		
	}

}