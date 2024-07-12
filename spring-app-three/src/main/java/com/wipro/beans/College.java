package com.wipro.beans;

public class College {

	private int regNo;
	private String name;
	private String principal;
	
	public College() {
	}

	public College(int regNo, String name, String principal) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "College [regNo=" + regNo + ", name=" + name + ", principal=" + principal + "]";
	}

}
