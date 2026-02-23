package oops_p;

import java.util.Arrays;

class OverAAA {
	void meth(String a, int b) {
		System.out.println("meth: "+a+", "+b);
	}
//	void meth(String a, int b) {
//		System.out.println("meth: "+a+", "+b);
//	}
//	void meth(String a, int c) {
//		매개변수 명이 다른 것은 오버로딩이 아님
//		System.out.println("meth: "+a+", "+c);
//	}
//	int meth(String a, int b) {
//		리턴과 오버로딩은 관계 없음
//		System.out.println("meth: "+a+", "+b);
//		return c;
//	}
	// 오버로딩 : 같은 클래스, 같은 메소드명 -> 매개변수가 다름 : 다른 메소드로 인식
	void meth(String a, int b, int c) {
		System.out.println("개수다름: "+a+", "+b+", "+c);
	}
	void meth(String a, String b) {
		System.out.println("자료형다름: "+a+", "+b);
	}
	void meth(String a, double b) {
		System.out.println("자료형다름2(double): "+a+", "+b);
	}
	void meth(String a, short b) {
		System.out.println("자료형다름3(shrot): "+a+", "+b);
	}
	void meth(String a, int ...b) {
		System.out.println("개수다름4: "+a+", "+Arrays.toString(b));
	}
}

public class OverloadingMain {

	public static void main(String[] args) {
		OverAAA oa = new OverAAA();
		oa.meth("아기상어", 10);
		oa.meth("엄마상어", 111, 222);
		oa.meth("이찬혁", "이수현");
		oa.meth("아빠상어", 10.34);
		oa.meth("할머니상어", (short)30);
		oa.meth("할아버지상어");
		oa.meth("삼촌상어", 11, 22, 33);
//		oa.meth(); -> 안됨
	}

}
