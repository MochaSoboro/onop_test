package oops_p;
/*
 * 아메리카노	:	원두
 * 카페라뗴	:	원두, 우유량
 * */

class OverCoffeeData {
	String title;
	int price, cnt;
	void init(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void ppp() {
		if (title != "카라멜마키아또") {
			System.out.println(title+"\t"+"\t"+price+"\t"+cnt+"\t"+price*cnt);
		}
		else {
			System.out.println(title+"\t"+price+"\t"+cnt+"\t"+price*cnt);			
		}
	}
}

class OverCoffeeShop {
	OverCoffeeData [] coffeeData = {
			makeData("아메리카노", 3000),
			makeData("카페라떼", 3300),
			makeData("카라멜마키아또", 3500),
			makeData("카페모카", 3500)
	};
	
//	void init() {
//		coffeeData = new OverCoffeeData[4];
//		for (int i=0; i<coffeeData.length; i++) {
//			coffeeData[i] = new OverCoffeeData();
//		}
//		coffeeData[0].init("아메리카노", 3000);
//	}
	
	OverCoffeeData makeData(String title, int price) {
		OverCoffeeData res = new OverCoffeeData();
		res.init(title, price);
		return res;
	}
	
	void ppp() {
		for (OverCoffeeData overCoffeeData : coffeeData) {
			overCoffeeData.ppp();
		}
	}
	
	void order(String bean) {
		coffeeData[0].cnt++;
		System.out.println(bean+" 아메리카노");
	}
	void order(String bean, int milk) {
		coffeeData[1].cnt++;
		System.out.println(bean+" 우유 "+milk+" "+"카페라떼");
	}
	void order(String bean, int milk, int syrup) {
		coffeeData[2].cnt++;
		System.out.println("카라멜마끼아또");
	}
	void order(String bean, int milk, boolean whipping) {
		coffeeData[3].cnt++;
		System.out.println("카페모카");
	}
}

public class OverCoffeeMain {

	public static void main(String[] args) {
		OverCoffeeShop shop = new OverCoffeeShop();
//		shop.init();
		shop.order("콜롬비아");
		shop.order("칠레");
		shop.order("콜롬비아", 30);
		shop.order("콜롬비아", 30, 20);
		shop.order("콜롬비아", 30, true);
		shop.ppp();
	}

}
