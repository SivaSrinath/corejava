package com.mut;

public class MutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutatorMeth s=new MutatorMeth();
		
		s.setName("srinath");
		s.setAge(23);
		
		System.out.println("name is "+s.getName());
		System.out.println("age is"+s.getAge());
		

	}

}
