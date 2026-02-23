package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.JoSuk;
import aop_p.webToon.TopMan;


public class ExecutionMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/execution.xml");	// xml 파일에서 <context:component-scan base-package="aop_p.execution"/> 필요
		
		Object rr = context.getBean("joSuk", JoSuk.class).dog1(10, "아기상어");
		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("joSuk", JoSuk.class).father(20, "엄마상어");
		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("topMan", TopMan.class).dog4(30, "아빠상어");
		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("avatar", Avatar.class).dog5(40, "아빠상어");
		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("topMan1", TopMan1.class).dog6();
		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("topMan2", TopMan2.class).dog7(40);
		System.out.println("rr: "+rr);
		// package aop_p.movie에 걸리지 않음
		// <aop:before method="movie" pointcut="execution(* aop_p.movie.*.*(..)))" />
		// 하위 패키지를 고려하지 않음
		System.out.println("--------------------------------------");
		context.getBean("topMan2", TopMan2.class).dog8(11, 22);
		System.out.println("--------------------------------------");
		
		context.close();
	}
}
