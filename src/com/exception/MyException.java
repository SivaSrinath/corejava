package com.exception;

public class MyException extends Exception{
	//to throw whether the balance amount is less than 1000;
	
	private static int accno[]={10001,10002,1004,1005};
	private static String name[]={"srinath","sahithi","rishi","ashish","mohan"};
	private static double bal[]={10000.00,12000.00,9990.00,5600.00,1100.55};
	//default constructor
	
	MyException(){
		
	}
	//parameterized constructor
	MyException(String str){
		super(str);
	}
	//write main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Accounno"+"\t"+"customer"+"\t"+"balance");
			//display actual account information
			for(int i=0; i<5; i++){
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				if(bal[i]<1000){
					MyException me=new MyException("balance amount is less");
					throw me;
				}
			}
		}catch(MyException me){
			me.printStackTrace();
		}
		

	}

}
