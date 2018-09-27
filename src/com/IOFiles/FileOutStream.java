package com.IOFiles;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class FileOutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Serializable 

		FileOutputStream fos = new FileOutputStream("E:\\corejava\\corejavabooks\\Files\\fos.txt", true);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(100);
		dos.writeByte(10);
		dos.writeChar('i');
		dos.writeUTF("java class");
		dos.close();
		fos.close();
		
	}

}
