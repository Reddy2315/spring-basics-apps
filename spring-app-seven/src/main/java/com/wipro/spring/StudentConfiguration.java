package com.wipro.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

	@Bean
	public Course getCourseBean() {
		Course c1 = new Course();
		c1.setId(111);
		c1.setName("Java FSD course");

		return c1;
	}

	@Bean
	public Student getStudentBean() {
		Student s1 = new Student();
		s1.setRollNo(1001);
		s1.setName("ArunKumar");
		s1.setBranch("CSE");
		s1.setCourse(getCourseBean());
		return s1;
	}

}
