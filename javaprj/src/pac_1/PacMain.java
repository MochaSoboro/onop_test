package pac_1;

import pac_2.CCC;	// 다른 패키지의 public 클래스 사용 시 import 필요
//import pac_2.EEE;	// 다른 패키지의 기분 클래스 import 불가
//import pac_2.FFF;
import pac_2.*;		// MOU, pac_2의 접근 가능한 모든 클래스 허용

class AAA {
	String a = "p1.AAA.a";
	private String d = "p1.AAA.private_b";	// 클래스 내부에서만 접근 가능
	
	void mm1() {
		System.out.println("p1.AAA.mm1() 실행");
	}
	private void mm4() {
		System.out.println("p1.AAA.privaate_mm4() 실행");
	}
	
	void meth() {
		System.out.println("AAA.meth 시작 --------");
		System.out.println(a+", "+d);
		mm1();
		mm4();
		System.out.println("AAA.meth 끝 --------");
	}
}

public class PacMain {

	// static : 생성하지 않고 사용
	// public : 어디에서도 접근 가능
	public static void main(String[] args) {
		System.out.println("메인 시작 --------------------------------");
		
		AAA p1a = new AAA();
		BBB p1b = new BBB();	// 같은 패키지 내에 정의된 클래스 사용 가능
		pac_1.CCC p1c = new pac_1.CCC();	// 권장하지 않음
		CCC p2c = new CCC();	// 다른 패키지의 클리스 사용시 import 필요
		FFF p2f = new FFF();
		
		System.out.println("p1a.a : "+p1a.a);
		p1a.mm1();
//		System.out.println("p1a.d : "+p1a.d);	// private 접근 불가
//		p1a.mm4();
		p1a.meth();
		System.out.println("p1b.a : "+p1b.a);
		p1b.mm1();
		
		System.out.println();
		
		System.out.println("p1c : "+p1c);
		System.out.println("p1c.a : "+p1c.a);
		p1c.mm1();
		System.out.println("p1c.public_b : "+p1c.b);	// 다른패키지 클래스의 public 멤버 접근 가능
		p1c.mm2();
		
		System.out.println();
		
		System.out.println("p2c : "+p2c);
//		System.out.println("p2c.a : "+p2c.a);
//		p2c.mm1();
		System.out.println("p2c.public_b : "+p2c.b);	// 다른패키지 클래스의 public 멤버 접근 가능
		p2c.mm2();
		System.out.println("p2f.public_b : "+p2f.b);
		p2f.mm2();
		
		System.out.println("--------------------------------------------");
		GChild gc = new GChild();
		
//		System.out.println("gc.a : "+gc.a);
		System.out.println("gc.b : "+gc.b);		// public만 가능
//		System.out.println("gc.c : "+gc.c);
//		System.out.println("gc.d : "+gc.d);
//		gc.mm1();
		gc.mm2();
//		gc.mm3();
//		gc.mm4();
		gc.meth();
		
	}

}
