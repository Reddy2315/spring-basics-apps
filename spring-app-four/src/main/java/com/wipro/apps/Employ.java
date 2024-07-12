package com.wipro.apps;

import java.util.List;

public class Employ {

	private int empNo;
	private String name;
	private double salary;

	private List<Project> projects;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employ [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", projects=" + projects + "]";
	}

	
	
}
