package com.wipro.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="stud")
@Scope(scopeName="prototype")
@PropertySource("classpath:student-info.properties")
public class Student {

	@Value("${student.rollNo}")
	private int rollNo;
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.branch}")
	private String branch;
	
	@Value("${student.email}")
	private String emailId;	
	
	@Autowired
	private Course course;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", emailId=" + emailId
				+ ", course=" + course + "]";
	}
	

	
}
