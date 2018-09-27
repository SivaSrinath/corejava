package com.IOFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	int rollNum;
	String name;
	transient Address add;
	
	Student(int rollNum, String name, Address add){
		this.rollNum= rollNum;
		this.name= name;
		this.add = add;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", add=" + add + "]";
	}
	public static void main(String args[]) throws FileNotFoundException, IOException {
		Student st = new Student(20, "srinath", new Address(1006192, "eluru"));
		st.writeObject(new ObjectOutputStream(new FileOutputStream("E:\\corejava\\corejavabooks\\FilesStdent.txt")));
	}
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.writeObject(add.hno);
			oos.writeUTF(add.city);
			oos.defaultWriteObject();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
	}
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			
			int hno = ois.readInt();
			String city = ois.readUTF();
			add = new Address(hno, city);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
