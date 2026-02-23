package basic_p;

/*
EnumSawonMain
직급별 상여율
사장(100), 부장(170), 과장(150), 대리(200), 사원(120)

이름		직급	기본급     
장동건	사원	300
장서건	과장	300
장남건	사장	300
장중건	대리	300
북두신건	부장	300
이효리	과장	400
삼효리	대리	500
사효리	사원	200
오효리	부장	500

출력
직급 이름 기본급 월급

직급순서대로 출력하세요
0
 * */

class SawonInd {
	String name, position;
	int salary;
	int rank;
	
	SawonInd(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.rank = EnumSawon.valueOf(position).getRank();
	}

	int calc() {
		return (int)(salary*EnumSawon.valueOf(position).getRate());
	}
	@Override
	public String toString() {
//		return rank+"\t"+EnumSawon.valueOf(position).position + "\t" + name + "\t" + salary + "\t" + calc();
		return EnumSawon.valueOf(position).position + "\t" + name + "\t" + salary + "\t" + calc();
	}
	
	
}

enum EnumSawon {
	SAZANG("사장", 1, 1), BUZANG("부장", 1.7, 2), GWAZANG("과장", 1.5, 3), DAERI("대리", 2, 4), SAWON("사원", 1.2, 5);
	
	final String position;
	final double rate;
	final int rank;
	
	private EnumSawon(String position, double rate, int rank) {
		this.position = position;
		this.rate = rate;
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}
	
	public double getRate() {
		return rate;
	}
	
}

public class EnumSawonMain {

	public static void main(String[] args) {
		
		SawonInd [] sawonList = {
				new SawonInd("장동건", "SAWON", 300),
				new SawonInd("장서건", "GWAZANG", 300),
				new SawonInd("장남건", "SAZANG", 300),
				new SawonInd("장중건", "DAERI", 300),
				new SawonInd("북두신건", "BUZANG", 300),
				new SawonInd("이효리", "GWAZANG", 400),
				new SawonInd("삼효리", "DAERI", 500),
				new SawonInd("사효리", "SAWON", 200),
				new SawonInd("오효리", "BUZANG", 500)
		};
		
//		for (SawonInd sss : sawonList) {
//			System.out.println(sss);
//		}
		
		for (int i=1; i<6; i++) {
			for (SawonInd sss : sawonList) {
				if (sss.rank == i) {
					System.out.println(sss);
				}
			}
		}
	}

}
