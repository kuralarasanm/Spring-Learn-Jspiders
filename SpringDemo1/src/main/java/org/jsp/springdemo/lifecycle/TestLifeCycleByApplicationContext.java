package org.jsp.springdemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleByApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println(context.getBean("test"));
		System.out.println(context.getBean("test"));
		System.out.println(context.getBean("test"));
		System.out.println(context.getBean("test"));
		((ClassPathXmlApplicationContext)context).close();
	}
}
