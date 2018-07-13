package com.vararg;

public class AdditionWithArrParam {
	
	static void add(int[] a) {
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
		add(new int[] {});
		add(new int[] {5});
		add(new int[] {5,6});
		add(new int[] {5,6,7});

	}

}