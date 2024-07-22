package org.jsp.annotation_autowired;

import org.springframework.stereotype.Component;

@Component(value = "munch")
public class Munch implements Chocolate {

	public void eat() {
		System.out.println("eating munch");

	}

}
