package aop_p;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.shape.Shape;
import aop_p.webToon.Tiger;

/*

PointShapeMain
도형 클래스를 구현하세요 
            넓이			둘레

    원 		r*r*PI 		r*2*PI 
직사각형 		가로*세로 		(가로 + 세로) *2
직각삼각형 	가로*세로/2 	가로+세로+빗변

aop를 이용하여 계산 할 때마다 각 도형의 넓이,둘레의 합계, 평균을 계산하세요
1. advice 가 합계를 저장할 변수를 멤버변수로 가지고 있기
2. 합계를 저장할 변수를 멤버변수로 가지고 있는 애가 Bean -> 꺼내서 쓸 수 있음

*/


public class AdviceMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/advice.xml");
		
		Tiger tg = context.getBean("tiger", Tiger.class);
		
		
		try {			
			Object rr = tg.meth1(10);
			System.out.println("rr: "+rr);
			System.out.println("-------------------------");
			
			rr = tg.meth1(0);
			System.out.println("rr: "+rr);
			System.out.println("-------------------------");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		context.close();
	}
}
