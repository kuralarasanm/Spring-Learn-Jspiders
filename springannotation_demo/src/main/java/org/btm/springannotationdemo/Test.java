package org.btm.springannotationdemo;

import org.jsp.springannotationdemo.Paytm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.btm","org.jsp");
//		Paytm p=context.getBean(Paytm.class);
		Paytm p=(Paytm) context.getBean("paytm");
		p.open();
//		Gpay gp=context.getBean(Gpay.class);
		Gpay gp=(Gpay) context.getBean("gpay");
		gp.open();
	}
}
