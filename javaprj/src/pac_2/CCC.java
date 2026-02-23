package pac_2;

// 대표 클래스 하나만 public으로 사용 가능
// 대표 클래스 = 자바 파일명과 같은 이름의 클래스
public class CCC {
	String a = "p2.CCC.a";
	void mm1() {
		System.out.println("p2.CCC.mm1() 실행");
	}
	
	public String b = "p2.CCC.public_b";
	public void mm2() {
		System.out.println("p2.CCC.public_mm2() 실행");
	}
}

//public class DDD {
//	String a = "p2.DDD.a";
//	void mm1() {
//		System.out.println("p2.DDD.mm1() 실행");
//	}
//	
//	public String b = "p2.DDD.public_b";
//	public void mm2() {
//		System.out.println("p2.DDD.public_mm2() 실행");
//	}
//}

class EEE {
	String a = "p2.EEE.a";
	void mm1() {
		System.out.println("p2.EEE.mm1() 실행");
	}
	
	public String b = "p2.EEE.public_b";
	public void mm2() {
		System.out.println("p2.EEE.public_mm2() 실행");
	}
}