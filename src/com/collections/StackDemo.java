package com.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("a"));

	}

}
