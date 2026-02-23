package oops_p;

/*
 * 자녀의 용돈은 엄마가 통괄로 100만원 지급
 * 자녀는 수시로 용돈을 필요한 만큼 가져간다.
 * 각 자녀는 자신이 가져간 용돈의 금액을 누적 형태로 알고 있어야 하며
 * 엄마는 자녀들이 가져간 용돈의 차액을 알고 있어야 한다.
 * 
 * 아빠가 돈을 벌어오게 해주세요
 * 아빠가 용돈을 받으려고 할 때 : 이사람이!!! -> 실행불가
 * 자식이 돈을 벌어오려고 할 때 : 건강하게만 자라다오 -> 실행불가
 * */

class Money {
	String pname;
	int myMoney = 0;
	static int mom = 100;
	
	Money(String pname) {
		this.pname = pname;
	}
	
	void showMeTheMoney(int money) {
		if (pname.equals("아빠")) {
			System.out.println("이사람이!!!");
			return;
		}
		myMoney += money;
		mom -= money;
		System.out.println(pname+" : "+money+"("+myMoney+")");
		System.out.println("\t잔액 : "+mom);
	}
	
	void earnMoney(int money) {
		if (!pname.equals("아빠")) {			
			System.out.println("건강하게만 자라다오");
			return;
		}
		mom += money;
		System.out.println("벌어온 돈 : "+money);
		System.out.println("\t잔액 : "+mom);
	}

}

public class PinMoneyMain {

	public static void main(String[] args) {
		Money son = new Money("아들");
		Money daughter = new Money("딸");
		Money father = new Money("아빠");
		
		son.showMeTheMoney(15);
		daughter.showMeTheMoney(7);
		daughter.showMeTheMoney(8);
		father.earnMoney(10);
		son.earnMoney(4);
	}

}
