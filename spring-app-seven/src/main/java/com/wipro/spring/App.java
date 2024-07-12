package com.wipro.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(StudentConfiguration.class);
    	Student student = ctx.getBean(Student.class);
    	
    	System.out.println(student);
    	
    }
}
