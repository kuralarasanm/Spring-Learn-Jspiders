package org.jsp.springdi.Controller;

import org.jsp.springdi.dto.Gpay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGpay {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("gpay.xml");
		Gpay p1=context.getBean("mygpay",Gpay.class);
		p1.getBank().balance();
		Gpay p2=context.getBean("urgpay",Gpay.class);
		p2.getBank().balance();
		
	}
}
