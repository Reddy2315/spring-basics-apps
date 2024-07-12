package com.wipro.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-config.xml");
    	
    	Employ employ = ctx.getBean("emp", Employ.class);
    	
    	
    	System.out.println(employ.getEmpNo()+" "+employ.getName()+" "+employ.getSalary());
    	
    	List<Project> projectList = employ.getProjects();
    	
    	for(Project p:projectList) {
    		System.out.println(p);
    	}
    	
    	
    	
    
    }
}
