package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireComputerMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di/autowirePart.xml", "di/autowireComp.xml");
		
		System.out.println(context.getBean("computer"));
		System.out.println(context.getBean("laptop"));
		
		context.close();

	}

}
