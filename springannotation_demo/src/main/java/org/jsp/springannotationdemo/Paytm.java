package org.jsp.springannotationdemo;

import org.springframework.stereotype.Component;

@Component(value="paytm")
public class Paytm {
	public void open() {
		System.out.println("welcome to paytm");
	}
}
