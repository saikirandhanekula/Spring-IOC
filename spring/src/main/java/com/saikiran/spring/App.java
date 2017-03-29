package com.saikiran.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       LaptopDetails ld  = context.getBean("Laptop Details", LaptopDetails.class);
       ld.getLaptopDetails();
    }
}
