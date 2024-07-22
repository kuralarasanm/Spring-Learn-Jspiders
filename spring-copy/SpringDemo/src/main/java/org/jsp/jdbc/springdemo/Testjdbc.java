package org.jsp.jdbc.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testjdbc {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Jdbc.xml");
	JdbcProperties p1=context.getBean("Jdbc",JdbcProperties.class);
	JdbcProperties p2=context.getBean("Jdbc2",JdbcProperties.class);
	p1.displayproperties();
	p2.displayproperties();
}
}
