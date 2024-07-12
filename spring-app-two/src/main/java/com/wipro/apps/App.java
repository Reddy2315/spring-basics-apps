package com.wipro.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.wipro.beans.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//College college=new College();
    		
    //	college.setRegNo(1234);
    	//college.setName("CBIT");
    	//college.setPrinipal("Arvindh Kumar");
    	
    	BeanFactory iocContainer=new XmlBeanFactory(new FileSystemResource("E:\\WiproSpringSpace\\spring-app-two\\src\\main\\resources\\spring-beans.xml"));
    	   	
    	
    	College college = iocContainer.getBean("col", College.class);  	
    	System.out.println(college.getRegNo()+" "+college.getName()+" "+college.getPrinipal());
    	
    	
    }
}
