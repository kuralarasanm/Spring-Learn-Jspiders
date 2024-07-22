package org.jsp.spring.properties;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("properties.xml");
		MySessionFactory factory=context.getBean("sessionFactory",MySessionFactory.class);
		System.out.println("url:"+factory.getDatasource().getUrl());
		System.out.println("username:"+factory.getDatasource().getUsername());
		System.out.println("driver class name:"+factory.getDatasource().getDriverclassname());
		System.out.println("password:"+factory.getDatasource().getPassword());
		System.out.println("mapping resources:"+new ArrayList<String>(Arrays.asList(factory.getMappingresources())));
		System.out.println("hibernate properties:"+factory.getHibernateproperties());
	}
}
