package oops_p;

class StaticCla {
	String a = "인스턴스a";
	int b = setB();
	int c = setC();
	int d = 40;
	int e = setE();
	int f = setF();
	int g = 70;
	
	StaticCla() {
		System.out.println("생성자");
	}

	int setB() {
		System.out.println("인스턴스 setB() 실행");
		return 10;
	}
	
	int setC() {
		System.out.println("인스턴스 setC() 실행");
		return 20;
	}
	
	int setE() {
		System.out.println("인스턴스 setE() 실행");
		return d;
	}
	
	int setF() {
		System.out.println("인스턴스 setF() 실행");
		return g;	// 공간 할당은 되었지만 대입은 되기 전 -> 초기값, g의 선언 위치와 상관 없음
	}
	
	void meth_1() {
		System.out.println("인스턴스 meth_1() 실행 : "+a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g);
		System.out.println("인스턴스 meth_1() 스태틱 : "+sa+", "+sb+", "+sc+", "+sd+", "+se+", "+sf);
		meth_2();
		meth_s2();
		System.out.println("인스턴스 meth_1 끝");
	}
	
	void meth_2() {
		int i = 1357;
//		static int j = 9989;	스태틱은 지역변수로 선언 불가
		System.out.println("인스턴스 meth_2() 실행 : "+i);
		
		// 메소드 안에서 메소드 정의 불가
//		void methSub() {};	
//		static void methSS() {};
		
	}
	static void meth_s2() {
		int i = 2468;
//		static int j = 7766;	스태틱은 지역변수로 선언 불가
		System.out.println("인스턴스 meth_s2() 실행 : "+i);
		
		// 메소드 안에서 메소드 정의 불가
//		void methSub() {};	
//		static void methSS() {};
	}
	
	static int sa = 100;
//	static int sb = setB();  -> setB()가 static이 아니라서 불가능
	static int sb = setSB();
	static int sc = 300;
	static int sd = setSD();
	static int se = setSE();
	static int sf = 600;
	
	static int setSB() {
		int rr = 200;
		System.out.println("인스턴스 setSB() 실행");
		return rr;
	}
	static int setSD() {
		System.out.println("인스턴스 setSD() 실행");
		return sc;
	}
	static int setSE() {
		System.out.println("인스턴스 setSE() 실행");
		return sf;
	}
	
	static void meth_s1() {
		System.out.println("인스턴스 meth_s1() 실행 : "+sa+", "+sb+", "+sc+", "+sd+", "+se+", "+sf);
		// static은 클래스 명으로 접근 가능해야 하기 때문에 인스턴스 요소들을 넣을 수 없음.
//		System.out.println("인스턴스 접근 불가 : "+a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g);
//		meth_2();	인스턴스 접근 불가
		meth_s2();
		System.out.println("인스턴스 meth_s1 끝");
	}
}

public class StaticMain {
	
	int a = 2345;
	static int sb = 5678;
	
	public StaticMain() {
		System.out.println("main 생성자");
		System.out.println(a+", "+sb);
	}

	public static void main(String[] args) {
//		System.out.println(StaticCla);
//		System.out.println(StaticCla.sa);
		StaticCla.meth_s1();
		StaticCla.sa = 1111;
		StaticCla.meth_s1();
		System.out.println("--------------------------------");
		StaticCla s1 = new StaticCla();
		System.out.println("--------------------------------");
		StaticCla s2 = new StaticCla();
		System.out.println("--------------------------------");
		s1.b = 101010;
		s2.c = 2345;
		s1.sb = 2468;	// 인스턴스들이 서로 공유
		s2.sc = 3210;
		s1.meth_1();
		s2.meth_1();
		System.out.println("--------------------------------");
		
//		System.out.println(a);
		System.out.println(sb);
		
		new StaticMain();
	}

}

