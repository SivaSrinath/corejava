package com.hashcode1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101, "srinath" , "java");
		Student s2 = new Student(102, "sahithi", "hadoop");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
