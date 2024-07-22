package org.jsp.springdi.Controller;

import org.jsp.springdi.dto.Phonepe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPhonepe {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("phonepe.xml");
		Phonepe p=context.getBean("myphonepe",Phonepe.class);
		Phonepe p2=context.getBean("yourphonepe",Phonepe.class);
		p.getBank().balance();
		p2.getBank().balance();
	}
}
