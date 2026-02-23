package dynamic_p;

class OverPar {
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1 실행 : "+a+", "+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2 실행 : "+a+", "+b);
	}
}

class OverChild extends OverPar {
	String a = "자식a", c = "자식c";
	
	void meth_1() {
		System.out.println("자식 meth_1 실행 : "+a+", "+b+", "+c);
	}
	void meth_3() {
		System.out.println("자식 meth_3 실행 : "+a+", "+b+", "+c);
	}
}

class OverUncle {
	
}

public class OverMain {

	public static void main(String[] args) {
		// OverPar은 어디까지 쓰겠다(범위), new OverPar()을 기준으로 생각해야함 (생성)
		OverPar pp = new OverPar();
		OverPar pc = new OverChild();
//		OverChild cp = new OverPar();
		OverChild cc = new OverChild();
		
		System.out.println("pp >>>>>");
		System.out.println(pp.a);
		System.out.println(pp.b);
//		System.out.println(pp.c);
		pp.meth_1();
		pp.meth_2();
//		pp.meth_3();
		
		System.out.println("pc >>>>>");
		System.out.println(pc.a);
		System.out.println(pc.b);
//		System.out.println(pc.c);
		pc.meth_1();
		pc.meth_2();
//		pc.meth_3();
		
		System.out.println("cc >>>>>");
		cc.c = "아들c";
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		// 업캐스팅
		OverPar pcc = cc;
		System.out.println("\npcc >>>>>");
		System.out.println(pcc.a);
		System.out.println(pcc.b);
//		System.out.println(pcc.c);
		pcc.meth_1();	// 오버라이딩 되어 자식의 meth_1을 실행
		pcc.meth_2();
//		pcc.meth_3();
		
//		OverChild cpcc = pcc;
		OverChild cpcc = (OverChild)pcc;	// down casting
		System.out.println("\ncpcc >>>>>");
		System.out.println(cpcc.a);
		System.out.println(cpcc.b);
		System.out.println(cpcc.c);
		cpcc.meth_1();	// 오버라이딩 되어 자식의 meth_1을 실행
		cpcc.meth_2();
		cpcc.meth_3();
		
//		OverChild cpp = pp;
//		OverChild cpp = (OverChild)pp;  OverPar로 생성되어 OverChild로 다운캐스팅 불가능
		
		// instanceof 형변환 확인 - 상속관계에서만 가능
		System.out.println(pp instanceof OverPar);		// true
		System.out.println(pp instanceof OverChild);	// false
		System.out.println(cc instanceof OverPar);		// true
		System.out.println(cc instanceof OverChild);	// true
		
//		System.out.println(pp instanceof OverUncle);
	}

}
