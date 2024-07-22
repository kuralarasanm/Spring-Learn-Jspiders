package org.jsp.springdemo.lifecycle;

public class Demo {
	static {
		System.out.println("demo class is loaded into JVM memory");
	}

	public Demo() {
		System.out.println("demo is getting instantiated");
	}

	public void byee() {
		System.out.println("demo object destroyed");
	}

	public void hii() {
		System.out.println("demo object initialized");
	}

}
