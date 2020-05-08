package com.example.bean.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans-Configuration.xml");

		HelloWorldExample obj = (HelloWorldExample) context.getBean("helloBean");
		obj.printHello();
}
}
