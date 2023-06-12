package com.simplilearn.demo.SpringSetupDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App 
{
    public static void main( String[] args )
    {
        //Resource resource= new ClassPathResource("beans.xml");
        //BeanFactory factory= new XmlBeanFactory(resource);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	Hello hello= (Hello) context.getBean("h");
    	hello.helloWorld();
    	
    }
}
