package com.inst.met;

public class EmpMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1=new Employee(10,400);
		//whenever an object is created constructor is executed.
		
		
		
		Check obj=new Check();
		// display data before calling 
		System.out.println(obj1.id1+"\t"+obj1.id2);
		
		
		obj.swap(obj1);
		
		//display data after calling
		System.out.println(obj1.id1+"\t"+obj1.id2);

	}

}
