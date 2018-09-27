package com.string.operations;

public class AppendTest26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb= new StringBuffer("113");
		
		sb.append("a");
		sb.append(10);
		//sb.append(String(null));
		System.out.println(sb);
		sb.append(20);
		StringBuffer sb2= new StringBuffer("23267000");
	
		//sb2.insert(2, "b");
		sb2.setCharAt(2, '-');
		System.out.println(sb2);
		sb2.insert(2,"-");
		System.out.println(sb2);
		sb2.insert(sb2.length()-1, 4);
		System.out.println(sb2);
		sb2.setCharAt(2, '-');
		System.out.println(sb2);
		
		
		
		
	}

}
