package pac_1;

import pac_2.GGG;

public class GChild extends GGG {
	void meth() {
		System.out.println("GChild.meth 시작 ----------------------------");
//		System.out.println("a : "+a);
		System.out.println("b : "+b);		// public
		System.out.println("c : "+c);		// protected : 다른 패키지 부모 클래스
//		System.out.println("d : "+d);
//		mm1();
		mm2();
		mm3();
//		mm4();
		System.out.println("GChild.meth 끝 ----------------------------");
	}
}
