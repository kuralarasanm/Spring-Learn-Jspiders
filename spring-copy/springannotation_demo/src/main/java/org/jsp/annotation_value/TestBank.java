package org.jsp.annotation_value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.annotation_value");
		Bank b=context.getBean(Bank.class);
		System.out.println(b.getBalance());
		System.out.println(b.getBank_name());
		System.out.println(b.getAcc_holder_name());
	}
}
