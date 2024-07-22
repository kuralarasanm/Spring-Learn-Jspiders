package org.jsp.annotation_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.annotation_autowired");
		Baby b=context.getBean(Baby.class);
		b.getCh().eat();
	}
}
