package com.wipro.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
   	
    	//Vehicle vehicle=new Vehicle();
    	
    	Resource resource=new FileSystemResource("E:\\WiproSpringSpace\\spring-app-one\\src\\main\\java\\com\\wipro\\app\\spring-beans.xml");
    	
		BeanFactory iocContainer=new XmlBeanFactory(resource);
		
		Object object=iocContainer.getBean("vehicle");
		
		Vehicle vehicle=(Vehicle)object;
    	
    	vehicle.start();
    	vehicle.travel("Pune", "Mumbai");
    	vehicle.stop();
    	
    }
}
