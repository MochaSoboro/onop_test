package basic_p;

public class ExamMain {

	public static void main(String[] args) {
		byte classnum = 2;
		String name = "홍길동";
		short eng = 89;
		short math = 78;
		short kor = 68;
		short total = (short)(eng + math + kor);
		float evg = (float)(int)(((float)total/3)*100)/100;
		char grade = (evg >= 90 ? '수' : (evg >= 80 ? '우' : (evg >= 70 ? '미' : (evg >= 60 ? '양' : '가'))));
		
		System.out.println("반 : "+classnum);
		System.out.println("이름 : "+name);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("국어 : "+kor);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+evg);
		System.out.println("등급 : "+grade);
		
		
	}

}
