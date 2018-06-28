package com.exception;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int n=1;
			int a=45/n;
			System.out.println("the value is :: "+a);
			
			int b[]= {10,20,30};
			b[2]= 200;
			System.out.println(b);
		}

		catch(ArithmeticException ae){
			System.out.println(ae);
			System.out.println("please pass data while running this program");
		}catch(IndexOutOfBoundsException aie){
			aie.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("exception");
		}
		finally{
			System.out.println("close files");
		}
	}

}
