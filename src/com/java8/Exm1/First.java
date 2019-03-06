package com.java8.Exm1;

public interface First {
	
	void abstractFun(int a);

	default void normalFund() {
		System.out.println("I am in interface");
	}
}
