package com.IOFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BankAccountOOS {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		BankAcount ba= new BankAcount();
		
		ba.setAccNo(25642);
		ba.setName("srinath");
		ba.setPassword("dka");
		
		FileOutputStream fos = new FileOutputStream("E:\\corejava\\corejavabooks\\Files\\fos1.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ba);
		
		FileInputStream fis = new FileInputStream("E:\\corejava\\corejavabooks\\Files\\fos1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		BankAcount bnkAct = (BankAcount) ois.readObject();
		System.out.println(bnkAct);

	}

}