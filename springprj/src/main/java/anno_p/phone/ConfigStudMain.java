package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigStudMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigStudData.class);
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("configStudData"));
	}
}
