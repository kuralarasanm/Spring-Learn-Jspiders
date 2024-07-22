package org.jsp.springdemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	static {
		System.out.println("test class is loaded into jvm memory");
	}

	public Test() {
		System.out.println("test is getting instantiated");
	}

	public void destroy() throws Exception {
		System.out.println("test object destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("test object initialized");
	}
}
