package org.jsp.annotation_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataSource {
public static void main(String[] args) {
	ApplicationContext  context=new AnnotationConfigApplicationContext(SFConfig.class);
	MySessionFactory factory=context.getBean(MySessionFactory.class);
	System.out.println(factory.getHibernateProperties());
	
}
}
