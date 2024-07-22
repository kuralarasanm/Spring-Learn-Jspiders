package org.btm.springannotationdemo;

import org.springframework.stereotype.Component;

@Component(value="gpay")
public class Gpay {
	public void open() {
		System.out.println("welcome to gpay");
	}
}
