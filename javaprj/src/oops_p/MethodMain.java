package oops_p;

class MeAAA {
	void meth_1() {
		System.out.println("매개변수 x, 리턴 x");
	}
	
	void meth_2(String aa, int bb) {
		System.out.println("매개변수 "+aa+", "+bb+", 리턴 x");
	}
	
	int meth_3() {
		System.out.println("매개변수 x, 리턴 int");
		return 1234;
	}
	
	String meth_4(String aa, int bb) {
		System.out.println("매개변수 "+aa+", "+bb+", 리턴 String");
		return "밥은먹고다니냐?";
	}
	
	// 같은 패키지 안에 있어서 사용 가능
	ClasStud makeSt() {
		System.out.println("학생 생성");
		ClasStud res = new ClasStud();
		res.init("손오공", 77, 79, 91);
		return res;
	}
	
	// overloading
	// 메소드 명은 동일하나 매개변수가 다름
	ClasStud makeSt(String name, int ...jum) {
		System.out.println("학생 생성2");
		ClasStud res = new ClasStud();
		res.init(name, jum);
		return res;
	}
}

public class MethodMain {

	public static void main(String[] args) {
		MeAAA ma = new MeAAA();
		ma.meth_1();
		ma.meth_2("나는반딧불", 10);
		ma.meth_3();
		ma.meth_4("나는레드불", 20);
		ClasStud r3 = ma.makeSt();
		r3.ppp();
		ClasStud r4 = ma.makeSt("차오즈", 88, 74, 92, 85);
		r4.ppp();
		
		ClasStud [] stArr = {
				ma.makeSt("손오공", 95, 97, 96),
				ma.makeSt("베지터", 87, 79, 91),
				ma.makeSt("크리링", 75, 96, 71, 72),
				ma.makeSt("피콜로", 87, 69, 71, 93),
				ma.makeSt("천진반", 97, 89, 51),
				ma.makeSt("무천도사", 88, 74, 92, 85)
		};
		
		for (ClasStud st : stArr) {
			st.ppp();
		}
	}

}
