package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di/autowire.xml", "di/autowire2.xml");
		
		System.out.println(context.getBean("fc"));
		System.out.println(context.getBean("hp1"));
		System.out.println(context.getBean("hp2"));
		System.out.println(context.getBean("hp3"));
		context.close();
	}
}
