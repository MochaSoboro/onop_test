package aop_p.webToon;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceExamAdvice {

	
	void beforeee(JoinPoint joinPoint) {
		System.out.println("before: "+joinPoint.toShortString());
		
//		System.out.println(joinPoint);
//		System.out.println(joinPoint.toShortString());
//		System.out.println(joinPoint.getSignature());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println(joinPoint.getSignature().toShortString());
//		System.out.println(joinPoint.getTarget());
//		System.out.println(Arrays.toString(joinPoint.getArgs()));
//		System.out.println(joinPoint.getThis());
	}
	
	void returning(JoinPoint joinPoint, Object ret) {
		System.out.println("returning: "+ret);
//		if ((int)ret >= 80) {
//			System.out.println("80점 이상");
//		}
//		else if ((int)ret >= 60) {
//			System.out.println("60점 이상");
//		}
//		else {
//			System.out.println("나머지");
//		}
	}
//	
//	void excepp(JoinPoint joinPoint, Throwable ee) {
//		System.out.println("excepp: "+ee.getMessage());
//	}
//	
//	void finallyyy(JoinPoint joinPoint) {
//		System.out.println("finallyyy: ");
//	}
	
}
