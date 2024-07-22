package org.jsp.springdi.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
		UPI u=context.getBean("upi",UPI.class);
		System.out.println(u.getBank().getbalance());
		
	}
}
