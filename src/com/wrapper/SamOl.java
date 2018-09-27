package com.wrapper;

public class SamOl extends ExamOl{
	
	void m1(Integer a) {
		System.out.println("Integer-arg");
	}
	
	public static void main(String args[]) {
		SamOl s = new SamOl();
		s.m1(10);
		s.m1(new Integer(10));
		
		ExamOl e = new ExamOl();
		e.m1(10);
		e.m1(new Integer(10));
	}

}
