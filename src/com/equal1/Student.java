package com.equal1;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	
	//defining constructor to initialize object with user given values
	public Student(int sno, String sname, String course) {
		this.sno= sno;
		this.sname= sname;
		this.course= course;	
	}
	
	//overriding equls mehtod
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else {
			if(obj instanceof Student) {
				Student s= (Student)obj;
				
				return(this.sno==s.sno) && 
						this.sname.equals(s.sname)&&
						this.course.equals(s.course);
			}
			else {
				return false;
			}
		}
	}

}