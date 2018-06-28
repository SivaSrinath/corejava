package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("maab.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(d);

		FileInputStream fis=new FileInputStream("maab.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.i+" ----"+ d1.j);
	}

}