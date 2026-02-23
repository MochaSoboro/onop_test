package inter_p;

////식당을 구현해주세요
//카운터 - 계산(몇번테이블에 얼마를), 인사
//홀 - 음식나르기(몇번테이블에 뭐를), 인사
//주방 - 설겆이(그릇몇개를)
////-> 구현객체 : 알바생

interface Counter {
	void calc(int tableNum, int price);
	void greets();
}

interface Hall {
	void serves(int tableNum, String meal);
	void greets();
}

interface Kitchen {
	void washDishes(int dishNum);
}

class PartTimer implements Counter, Hall, Kitchen {

	@Override
	public void washDishes(int dishNum) {
		System.out.println("설거지 "+dishNum+"개");
	}

	@Override
	public void serves(int tableNum, String meal) {
		System.out.println(tableNum+"번 테이블에 "+meal+" 서빙");
	}

	@Override
	public void calc(int tableNum, int price) {
		System.out.println(tableNum+"번 테이블 "+price+"만원 계산");
	}

	@Override
	public void greets() {
		System.out.println("인사");
	}
	
}

public class RestaurantMain {

	public static void main(String[] args) {
		PartTimer pt = new PartTimer();
		Counter cc;
		Hall hh;
		Kitchen kk;
		
		cc = pt;
		cc.greets();
		cc.calc(3, 3);
		System.out.println();
		
		hh = pt;
		hh.serves(2, "칼국수");
		hh.greets();
		System.out.println();
		
		kk = pt;
		kk.washDishes(10);
	}

}
