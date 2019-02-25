package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Basic {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("testbean.xml");
		Stundent student=(Stundent)context.getBean("studentbean");
		student.display();
	
	}

}
