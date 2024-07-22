package org.jsp.annotation_autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "Five Star")
public class FiveStar implements Chocolate{

	@Primary
	public void eat() {
		System.out.println("eating five star");
	}
	
}
