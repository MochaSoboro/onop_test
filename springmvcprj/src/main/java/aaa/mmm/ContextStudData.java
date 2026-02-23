package aaa.mmm;

import lombok.Data;

@Data
public class ContextStudData {

	ContextStud [] stud = {
			new ContextStud(1, 80, 92, 77),
			new ContextStud(2, 60, 88, 91),
			new ContextStud(3, 78, 64, 80),
	};
	
	public ContextStud [] sdata() {
		return stud;
	}
	public ContextStud sddata(int i) {
		return stud[i-1];
	}
	
	
}
