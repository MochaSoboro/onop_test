package aop_p.ddd;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class PointShapeAdvice {
	
	static int cArea = 0, cBorder = 0, cCnt = 0;
	static int rArea = 0, rBorder = 0, rCnt = 0;
	static int tArea = 0, tBorder = 0, tCnt = 0;
	Object calc(ProceedingJoinPoint joinPoint) {
		int [] res = null;
//		String res = null;
		String name = null;
		int cnt = 0, area = 0, border = 0;
		System.out.println(" >>> aroundTest 시작: ");
//		System.out.println(joinPoint);
//		System.out.println(joinPoint.toShortString());
//		System.out.println(joinPoint.getSignature());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println(joinPoint.getSignature().toShortString());
//		System.out.println(joinPoint.getTarget());
//		System.out.println(joinPoint.getArgs().length);
//		System.out.println(Arrays.toString(joinPoint.getArgs()));
//		System.out.println(joinPoint.getThis());
		try {
			int [] buf = (int [])joinPoint.proceed();
			if (joinPoint.getArgs().length == 1) {
				cnt = ++cCnt;
				cArea += buf[0];
				cBorder += buf[1];
				area = cArea;
				border = cBorder;
//				res = "원";
				
			}
			else if (joinPoint.getArgs().length == 2) {
				cnt = ++rCnt;
				rArea += buf[0];
				rBorder += buf[1];
				area = rArea;
				border = rBorder;
//				res = "직사각형";
			}
			else if (joinPoint.getArgs().length == 3) {
				cnt = ++tCnt;
				tArea += buf[0];
				tBorder += buf[1];
				area = tArea;
				border = tBorder;
//				res = "직각삼각형";
			}
			res = new int [] {buf[0], buf[1], area, border, (area/cnt), (border/cnt)};
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" >>> aroundTest 종료: "+Arrays.toString(res)+", "+cnt);
//		System.out.println(" >>> aroundTest 종료: "+res+", "+cnt);
		
		return res;
	}
}
