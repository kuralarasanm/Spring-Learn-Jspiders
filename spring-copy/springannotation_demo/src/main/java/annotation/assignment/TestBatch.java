package annotation.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBatch {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
		Batch b=context.getBean(Batch.class);
		System.out.println(b.getNames());
		System.out.println(b.getPhone());
		System.out.println(b.getPerc());
		System.out.println(b.getYop());
	}
}
