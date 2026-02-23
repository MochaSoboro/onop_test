package oops_p;

import java.util.Arrays;

class ClasStud {
	String name, kind;
	int [] jum;
	int tot;
	double avg;
	double [] rate = {0.05, 0.1, 0.15, 0.7};
	
	void init(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
		kind = new String[] {"일반", "예능"}[jum.length-3];
		if (kind == "일반") {			
			calc();
		}
		else {
			artCalc();
		}
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void artCalc() {
		tot = 0;
		avg = 0;
		for (int i=0; i<jum.length; i++) {
			tot += jum[i];
			avg += jum[i] * rate[i];
		}
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t";
		ttt += Arrays.toString(jum)+"\t";
		ttt += "\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}

//class AAA {}	같은 패키지에서 같은 이름으로 클래스 정의 불가

public class ClassExamMain {

	public static void main(String[] args) {
//		ClasStud st1 = new ClasStud();
//		ClasStud st2 = new ClasStud();
//		st1.init("손오공", 95, 97, 96);
//		st2.init("크리링", 95, 79, 51, 96);
//		st1.ppp();
//		st2.ppp();
		
		ClasStud [] stArr = new ClasStud[6];
//		stArr[0].init("손오공", 95, 97, 96);	NullPointerException
		System.out.println(stArr+":"+stArr.length+":"+Arrays.toString(stArr));
		
		for (int i=0; i<stArr.length; i++) {
			// 하나하나 새로 지정해줘야 한다.
			stArr[i] = new ClasStud();
		}
		
		stArr[0].init("손오공", 95, 97, 96);
		stArr[1].init("베지터", 87, 79, 91);
		stArr[2].init("크리링", 75, 96, 71, 72);
		stArr[3].init("피콜로", 87, 69, 71, 93);
		stArr[4].init("천진반", 97, 89, 51);
		stArr[5].init("무천도사", 88, 74, 92, 85);
		
		for (ClasStud st : stArr) {
			st.ppp();
		}
		
		
		
	}

}
