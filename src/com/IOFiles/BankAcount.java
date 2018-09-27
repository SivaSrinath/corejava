package com.IOFiles;

import java.io.Serializable;

public class BankAcount implements Serializable{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1555146536092048185L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int accNo;
	private String name;
	transient private String password;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAcount [accNo=" + accNo + ", name=" + name + ", password=" + password + "]";
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	 
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

	

}
