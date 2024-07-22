package springannotation_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testcar {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Car.class,Testcar.class);
		context.refresh();
		Car c=context.getBean(Car.class);
		c.start();
	}
}
