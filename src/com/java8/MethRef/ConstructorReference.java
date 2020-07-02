package com.java8.MethRef;

import com.java8.MethRef.interf.Messageable;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Messageable msg = Message::new;
		
		msg.getMessage("hello");
	}

}
