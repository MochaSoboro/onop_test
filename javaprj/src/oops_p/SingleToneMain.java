package oops_p;

class SingleTTT {
	String a = "장동건";
	int b = 10;
	
	private static SingleTTT me = null;
	
	private SingleTTT() {
		System.out.println("기본생성자 실행");
	}
	
	public static SingleTTT getInstance() {
		
		if (me == null) {
			me = new SingleTTT();
		}
		return me;
	}

	@Override
	public String toString() {
		return "SingleTTT [a=" + a + ", b=" + b + "]";
	}
	
}

public class SingleToneMain {
	public static void main(String[] args) {
//		SingleTTT st = new SingleTTT();		접근 불가
//		System.out.println(SingleTTT.me);	접근 불가
		
		SingleTTT st1 = SingleTTT.getInstance();
		System.out.println("--------------");
		SingleTTT st2 = SingleTTT.getInstance();
		System.out.println("--------------");
		st1.a = "원빈";
		st2.b = 20;
		System.out.println(st1 == st2);		// true
		System.out.println(st1);
		System.out.println(st2);
	}
}
