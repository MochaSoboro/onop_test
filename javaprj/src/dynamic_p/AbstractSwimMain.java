package dynamic_p;

/*
 * 수영 선수를 구현
 * 
 * 부모 : 수영 선수
 * 필드 : 이름, 종목 (자유형, 접영, 평영, 배영)
 * 메소드 : 수영해요(거리) - 추상화
 * 
 * 자식 :
 * 자유형선수 - 1m당 몇초, - :: 자유형 이름 거리 몇초 수영해요
 * 접영선수 - 1m당 몇초, 50m당 -0.초 느려짐, :::: 접영 이름 거리 몇초 수영해요
 * 평영선수 - 1m당 몇초, 잠영몇m, :::: 평영 이름 거리 잠영m 몇초 수영해요
 * 배영선수 - 1m당 몇초, :::: 배영 이름 거리 몇초 수영해요
 * */

abstract class AbsSwimParent {
	String name, strock;
	int mps;
	
	AbsSwimParent(String strock, String name) {
		this.strock = strock;
		this.name = name;
	}
	abstract void swim(int meter);
	
	void ppp() {
		System.out.println(strock+"\t"+name);
	}
}

class AbsSwimFreestyle extends AbsSwimParent {
	int meter, sec;
	
	AbsSwimFreestyle(String name, int meter, int sec) {
		super("자유형", name);
		System.out.println(name+" "+meter+" "+sec);
		this.meter = meter;
		swim(meter);
		this.sec = sec;
	}
	
	@Override
	void swim(int meter) {
		System.out.println(sec);
	}
}
class AbsSwimbutterfly extends AbsSwimParent {
	
	AbsSwimbutterfly(String name) {
		super("접영", name);
	}

	@Override
	void swim(int meter) {
		
	}
}
class AbsSwimbreaststroke extends AbsSwimParent {
	
	AbsSwimbreaststroke(String name) {
		super("평영", name);
	}

	@Override
	void swim(int meter) {
		
	}
}
class AbsSwimbackstroke extends AbsSwimParent {
	
	AbsSwimbackstroke(String name) {
		super("배영", name);
	}

	@Override
	void swim(int meter) {
		
	}
}

public class AbstractSwimMain {

	public static void main(String[] args) {
		new AbsSwimFreestyle("AAA", 50, 5).ppp();
	}

}
