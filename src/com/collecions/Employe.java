package com.collecions;

public class Employe implements Comparable<Employe> {
	private int sal;
	private String name;
    
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}

	/**
	 * @param sal
	 *            the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Employe(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Employe emp) {
		System.out.println("I am in compara method");
		if (this.getSal() == emp.getSal())
			return 0;
		if (this.getSal() < emp.getSal())
			return -1;

		if (this.getSal() > emp.getSal())
			return 1;

		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employe [sal=" + sal + ", name=" + name + "]";
	}

}
