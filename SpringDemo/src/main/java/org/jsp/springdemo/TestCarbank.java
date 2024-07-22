package org.jsp.springdemo;

import org.jsp.springdemo.BankAccount;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCarbank {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("bank.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		BankAccount account=factory.getBean("Account",BankAccount.class);
		account.balance();
	}
}
