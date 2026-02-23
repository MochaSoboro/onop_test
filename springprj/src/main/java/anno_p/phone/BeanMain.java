package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno/bean.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("cam1"));
		System.out.println(context.getBean("cam2"));
		System.out.println(context.getBean("dr1"));
		
		context.close();

	}

}
