package aop_p.ddd;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

//xml 파일에 bean으로 만듦 <bean class="aop_p.ddd.WebAroundAdvice" name="waa" />

public class WebAroundAdvice {
	Object aroundTest(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println(" >>> aroundTest 시작: ");
		System.out.println(joinPoint);
		System.out.println(joinPoint.toShortString());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getSignature().toShortString());
		System.out.println(joinPoint.getTarget());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		System.out.println(joinPoint.getThis());
		
		try {
			int i = (int)joinPoint.getArgs()[0];
			
			if(i >= 10) {	// 매개변수를 이용하여 proceeding을 결정
				String buf = (String)joinPoint.proceed();
				res = buf;
				if (buf.length() > 3) {
					res = buf.substring(0, 3);
				}
			} else {
				System.out.println("10 미만 실행 불가");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" >>> aroundTest 종료: "+res);
		
		return res;
	}
}
