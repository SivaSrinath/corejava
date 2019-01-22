package com.equal1;

public class Test {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student(1, "srinath", "java");
		Student s2= new Student(2, "sahithi", "Hadop");
		Student s3= new Student(1, "srinath", "java");
		Student s4= s2;
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		Address add= new Address();
		
		Address a1 = null;
		Address a2 = null;
		
		//System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));

		
	}

}
