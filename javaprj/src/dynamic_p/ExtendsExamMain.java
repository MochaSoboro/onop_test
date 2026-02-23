package dynamic_p;

class ExStud {
	String kind, pname;
	int tot, avg;
	
	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+tot+"\t"+avg);
	}
}

class ExGen extends ExStud {
	ExGen(String pname, int kor, int eng, int mat) {
		this.kind = "일반";
		this.pname = pname;
		tot = kor + eng + mat;
		avg = tot / 3;
	}
}
class ExArt extends ExStud {
	ExArt(String pname, int kor, int eng, int art) {
		this.kind = "예능";
		this.pname = pname;
		tot = kor + eng + art;
		avg = (int)(kor*0.1 + eng*0.2 + art*0.7);
	}
}

public class ExtendsExamMain {

	public static void main(String[] args) {
//		new ExGen("이상해씨", 35, 61, 93).ppp();
//		new ExArt("파이리", 35, 61, 93).ppp();
//		new ExGen("꼬부기", 95, 61, 33).ppp();
//		new ExArt("캐터피", 95, 61, 33).ppp();
//		new ExGen("구구", 65, 61, 63).ppp();
//		new ExArt("피카츄", 75, 71, 73).ppp();
//		new ExGen("식스테일", 75, 81, 93).ppp();
//		new ExArt("푸린", 75, 81, 93).ppp();
		
		ExStud [] studs = {
			new ExGen("이상해씨", 35, 61, 93),
			new ExArt("파이리", 35, 61, 93),
			new ExGen("꼬부기", 95, 61, 33),
			new ExArt("캐터피", 95, 61, 33),
			new ExGen("구구", 65, 61, 63),
			new ExArt("피카츄", 75, 71, 73),
			new ExGen("식스테일", 75, 81, 93),
			new ExArt("푸린", 75, 81, 93)	
		};
		
		for (ExStud st : studs) {
			st.ppp();
		}
	}

}
