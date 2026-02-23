package dynamic_p;

class ExLifePar {
	String a = setA();
	String b;
	static String sa = setSA();
	
	String setA() {
		System.out.println("부모 인스턴스 setA 실행");
		return "parent instance A";
	}

	static String setSA() {
		System.out.println("부모 스태틱 setSA 실행");
		return "parent static SA";
	}
	
	ExLifePar(String b) {
		this.b = b;
		System.out.println("부모생성자 : "+b);
	}
}
class ExLifeChild extends ExLifePar {
	String ca = setCA();
	String cd;
	static String csa = setCSA();
	
	ExLifeChild() {
		this("기본cd");	// super를 포함한 생성자에 위임하므로 부모 생성자 기재 안 함.
//		super("자식생성시b");	부모 생성자가 가장 우위에 있어야 함.
		System.out.println("자식 기본생성자");
	}
	ExLifeChild(String cd) {
		super("자식생성시b");	// 부모생성자가 사용자 정의일 경우 반드시 기재 - 가장 높은 우선순위를 갖게 됨
		this.cd = cd;
		System.out.println("자식 사용자정의 생성자");
	}
	
	String setCA() {
		System.out.println("자식 인스턴스 setCA 실행");
		return "child instance CA";
	}
	
	static String setCSA() {
		System.out.println("자식 스태틱 setCSA 실행");
		return "child static CSA";
	}
	
}

public class ExLifeCycleMain {

	public static void main(String[] args) {
		ExLifeChild cc1 = new ExLifeChild("cc1_cd");
	}

}
