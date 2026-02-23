package oops_p;


class NLOuter {
	String a;
	int b;
	static String sa = "외부 static sa";
	static int sb = 1000;
	
	// 클래스 정의부에서는 제어문과 같은 코딩연산 불가
	// 선언과 정의만 가능
	
	void meth_1() {
		System.out.println("외부 meth_1() ------------------------ 시작");
		
		// 메소드 안에서 메소드 정의 불가
//		void meth_1234() {}
		
		// 메소드 내부에 정의
		class NLInner {
			String a;
			int bb;
			
			static String sa = "NLInner_sa";
			static int sc = 2222;
			
			void meth_3() {
				System.out.println("내부 meth_3() 시작-----------------------");
				System.out.println("외부: "+NLOuter.this.a+", "+b);
				System.out.println("외부스태틱: "+NLOuter.sa+", "+sb);
				meth_2();
				NLOuter.this.meth_4();
				NLOuter.meth_s1();
				meth_s2();
				System.out.println("내부: "+a+", "+bb);
				System.out.println("내부스태틱: "+sa+", "+sc);
				meth_4();
				meth_s3();
				System.out.println("내부 meth_3() 끝-----------------------");
			}
			void meth_4() {
				System.out.println("내부 meth_4()");
			}
			static void meth_s1() {
				System.out.println("내부 static meth_s1(): 시작-----------------------");
//				System.out.println("외부: "+NLOuter.this.a+", "+b);
				System.out.println("외부스태틱: "+NLOuter.sa+", "+sb);
//				meth_2();
//				NLOuter.this.meth_4();
				NLOuter.meth_s1();
				meth_s2();
//				System.out.println("내부: "+a+", "+bb);
				System.out.println("내부스태틱: "+sa+", "+sc);
//				meth_4();
				meth_s3();
				System.out.println("내부 static meth_s1(): 끝-----------------------");
			}
			static void meth_s3() {
				System.out.println("내부 static meth_s3(): ");
			}
			NLInner(String aa, int bb) {
				this.a = aa;
				this.bb = bb;
			}
			@Override
			public String toString() {
				return "NLInner [a=" + a + ", bb=" + bb + "]";
			}
		}
		// 지역 이너클래스는 정의된 메소드 내부에서만 사용 가능
		NLInner ni = new NLInner("아기상어", 3456);
		System.out.println("ni: "+ni);
		System.out.println("NLInner: "+NLInner.sa+", "+NLInner.sc);
		ni.meth_3();
		ni.meth_s1();
		
		System.out.println("외부 meth_1() ------------------------ 끝");
	}
	
	
	// 지역 이너클래스 멤버로 사용 불가
//	NLInner mm1;
	
	void meth_2() {
		System.out.println("외부 meth_2()");
	}
	void meth_4() {
		System.out.println("외부 meth_4()");
	}
	static void meth_s1() {
		System.out.println("외부 static meth_s1(): ");
	}
	static void meth_s2() {
		System.out.println("외부 static meth_s2(): ");
	}
	NLOuter(String a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "NLOuter [a=" + a + ", b=" + b + "]";
	}
}

public class NestedLocalMain {

	public static void main(String[] args) {
		NLOuter oo1 = new NLOuter("차은우", 1234);
		System.out.println(oo1);
		oo1.meth_1();
//		NLOuter.NLInner nl;
	}

}
