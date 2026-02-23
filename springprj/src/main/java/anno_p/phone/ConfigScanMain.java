package anno_p.phone;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigScanMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigScan.class);
		
//		context.close();	없음
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("bbtt"));
		System.out.println(context.getBean("camera"));
		System.out.println(context.getBean("handPhone"));
		System.out.println(context.getBean("comWatch"));
		System.out.println(context.getBean("mic"));
		
		System.out.println("-------------------------------");
		
		System.out.println(context.getBean("arr1"));
	}

}
