package aop_p;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.shape.Shape;

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


public class PointShapeMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/pointShape.xml");
		
		Object rr = context.getBean("shape", Shape.class).calcLine(3);
		System.out.println("rr: "+Arrays.toString((int [])rr));
//		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("shape", Shape.class).calcLine(5);
		System.out.println("rr: "+Arrays.toString((int [])rr));
//		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("shape", Shape.class).calcLine(5, 4);
		System.out.println("rr: "+Arrays.toString((int [])rr));
//		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("shape", Shape.class).calcLine(12, 8, 6);
		System.out.println("rr: "+Arrays.toString((int [])rr));
//		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		rr = context.getBean("shape", Shape.class).calcLine(6, 7);
		System.out.println("rr: "+Arrays.toString((int [])rr));
//		System.out.println("rr: "+rr);
		System.out.println("--------------------------------------");
		
		context.close();
	}
}
