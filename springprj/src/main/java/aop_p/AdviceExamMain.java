package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.AdviceExams;

public class AdviceExamMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop/adviceExam.xml");
		
		AdviceExams exam = context.getBean("adviceExams", AdviceExams.class);
		
		
		try {			
			Object rr = exam.examMiddle("AAA", new int[] {10, 20, 30});
			System.out.println("rr: "+rr);
			System.out.println("-------------------------");
			rr = exam.examFinal("AAA", new int[] {10, 20, 30});
			System.out.println("rr: "+rr);
			System.out.println("-------------------------");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		context.close();
	}
}
