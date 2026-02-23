package dynamic_p;
/*
 * 자동차 성능 테스트
 * 
 * 부모 : 자동차
 * 
 * 자식
 * 스포츠카 : 속도 0.5, 연비 0.2, 디자인 0.3
 * 트럭 : 연비 0.6, 적재종류(최대 4개) : 개당 10점
 * 승합차 : 속도 0.15, 연비 0.35, 탐승인원 0.5
 * */

class OverCarParent {
	int speed, fuel, design, type, people, result;
	String name;
	
	void ppp() {
		System.out.println(name+" 성능점수\t : \t"+result);
	}
}

class SportsCar extends OverCarParent {
	public SportsCar(int speed, int fuel, int design) {
		name = "스포츠카";
		this.speed = speed;
		this.fuel = fuel;
		this.design = design;
		result = (int) (speed*0.5 + fuel*0.2 + design*0.3);
	}
}

class Trucks extends OverCarParent {
	public Trucks(int fuel, int type) {
		name = "트럭";
		this.fuel = fuel;
		this.type = type;
		result = (int) (fuel*0.6 + type*10);
	}
}

class Vans extends OverCarParent {
	public Vans(int speed, int fuel, int people) {
		name = "승합차";
		this.speed = speed;
		this.fuel = fuel;
		this.people = people;
		result = (int) (speed*0.15 + fuel*0.35 + people*0.5);
	}
}

public class OverCarMain {

	public static void main(String[] args) {
		OverCarParent [] cars = {
				new SportsCar(200, 150, 100),
				new Trucks(70, 3),
				new Vans(120, 80, 6)
		};
		
		for (OverCarParent cc : cars) {
			cc.ppp();
		}
	}

}
