package com.wipro.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.beans.College;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// College c1=new College(99456, "KITS COLLEGE", "VISHAL");

		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-beans-config.xml");
		College c1 = ioc.getBean("colg",College.class);

		System.out.println(c1);
		
		College c2 = ioc.getBean("colg",College.class);

		System.out.println(c2);
		
		College c3 = ioc.getBean("colg",College.class);

		System.out.println(c3);
		
		System.out.println(c1.hashCode()+"----->"+c2.hashCode()+"---->"+c3.hashCode());
		

	}
}
