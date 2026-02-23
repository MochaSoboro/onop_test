package aop_p.webToon;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdvAdvice {
	
//	ProceedingJoinPoint -- around만 가능
	void beforeee(JoinPoint joinPoint) {
		System.out.println("before: "+joinPoint.toShortString());
		/*
		System.out.println(joinPoint);
		System.out.println(joinPoint.toShortString());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getSignature().toShortString());
		System.out.println(joinPoint.getTarget());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		System.out.println(joinPoint.getThis());
		
		execution(String aop_p.webToon.Tiger.meth1(int))
		execution(Tiger.meth1(..))
		String aop_p.webToon.Tiger.meth1(int)
		meth1
		Tiger.meth1(..)
		aop_p.webToon.Tiger@6c25e6c4
		[10]
		aop_p.webToon.Tiger@6c25e6c4
		*/
		
//		joinPoint.proceed();
//		proceed() 불가 -> 실제 메소드 실행여부를 설정할 수 없다
	}
	
//	void returning(ProceedingJoinPoint joinPoint) {
	void returning(JoinPoint joinPoint, Object ret) {
		System.out.println("returning: "+ret);
	}
	
	void excepp(JoinPoint joinPoint, Throwable ee) {
		System.out.println("excepp: "+ee.getMessage());
	}
	
	void finallyyy(JoinPoint joinPoint) {
		System.out.println("finallyyy: ");
	}
	
}
