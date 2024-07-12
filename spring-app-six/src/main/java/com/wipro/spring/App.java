package com.wipro.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring.beans.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.wipro.spring");

		Student student = ctx.getBean("stud", Student.class);

		System.out.println(student);

		Student student2 = ctx.getBean("stud", Student.class);

		System.out.println(student2);

		System.out.println(student.getCourse().hashCode()+" --- "+student2.getCourse().hashCode());
	}
}
