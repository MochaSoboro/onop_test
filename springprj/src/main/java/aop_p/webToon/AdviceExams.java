package aop_p.webToon;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class AdviceExams {
	public AdviceStudentInfo examMiddle(String name, int[] jum) {
		int total = Arrays.stream(jum).sum();
		int avg = (int)total/jum.length;
		return new AdviceStudentInfo(name, "중간고사", total, avg);
	}
		
	public AdviceStudentInfo examFinal(String name, int[] jum) {
		int total = Arrays.stream(jum).sum();
		int avg = (int)total/jum.length;
		return new AdviceStudentInfo(name, "기말고사", total, avg);
	}
}