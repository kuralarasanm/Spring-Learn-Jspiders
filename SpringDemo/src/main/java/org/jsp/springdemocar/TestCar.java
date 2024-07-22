package org.jsp.springdemocar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("car.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Car c=(Car)factory.getBean("mycar");
		Car c2=(Car)factory.getBean(Car.class);
		Car c3=(Car)factory.getBean("mycar",Car.class);
		c.start();
		c2.start();
		c3.start();
	}
}
