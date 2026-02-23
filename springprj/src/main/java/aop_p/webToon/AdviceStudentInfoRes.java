package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class AdviceStudentInfoRes {
	String name;
	int a, b, c;
	AdviceStudentInfo middleE = null;
	AdviceStudentInfo finalE = null;
	
	
	
	AdviceStudentInfoRes() {
		middleE = new AdviceExams().examMiddle("합계", new int[] {0, 0, 0});
		finalE = new AdviceExams().examFinal("합계", new int[] {0, 0, 0});
	}



	public void add(AdviceStudentInfo studs) {
		
	}
}
