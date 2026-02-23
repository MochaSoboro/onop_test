package anno_p.phone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCarMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno/beanCar.xml");
		
		System.out.println(context.getBean("f1"));
		System.out.println(context.getBean("limousine"));
		System.out.println(context.getBean("truck"));
		
		context.close();
	}

}
