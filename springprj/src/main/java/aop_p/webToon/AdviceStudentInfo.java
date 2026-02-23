package aop_p.webToon;

import lombok.Data;

@Data
public class AdviceStudentInfo {
	String name, type;
	int total, avg;
	AdviceStudentInfo(String name, String type, int total, int avg) {
		this.name = name;
		this.type = type;
		this.total = total;
		this.avg = avg;
	}
	
}
