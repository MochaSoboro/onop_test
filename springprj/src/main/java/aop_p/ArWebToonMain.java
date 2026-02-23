package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;


public class ArWebToonMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/arWebToon.xml");	// xml 파일에서 <context:component-scan base-package="aop_p.webToon"/> 필요
		
		JoSuk js = context.getBean("joSuk", JoSuk.class);
		
		Object rr = js.dog1(9, "아기상어");
		System.out.println(rr);
		
		System.out.println("------------------");
		
		rr = js.dog2(20, "엄마상어");
		System.out.println(rr);
		
		System.out.println("------------------");
		
		rr = js.dog3(30, "아빠상어");
		System.out.println(rr);
		
		System.out.println("------------------");
		
		rr = js.dog1(40, "할머니상어");
		System.out.println(rr);
		
		context.close();
	}
}
