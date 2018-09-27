package com.vararg;

public class AdditionWithVarArrParam {
	
	static void add(int b,int... a) {
		if(a.length==0) {
			System.out.println("values are not passed");
		}else {
			int sum=0;
			for(int i=0; i<a.length;i++) {
				sum= sum+a[i];
			}
			System.out.println("result :"+ sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1);
		add(1);
		add(1,2);
		add(1,2,3);
		add(1,new int[]{5,6,7});

	}

}
