package oops_p;

class CoffeeShop {
	String name;
	String [] coffee = "아메리카노,아시아노,아프리카노".split(",");
	int [] price = new int[coffee.length];
	int [] sale = new int[coffee.length];
	int [] ind_sale = new int[coffee.length];
	int total = 0;
	
	CoffeeShop(String name, int[] price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String ttt = name+" >>>>>\n";
		for (int i=0; i<coffee.length; i++) {
			ttt += coffee[i]+"\t"+sale[i]+"\t"+ind_sale[i]+"\n";
		}
		ttt += "총 판매금액\t\t"+total;
		return ttt;
	}


	class CoffeeBranch {
		String location;
		int [] sale = new int[coffee.length];
		int [] ind_sale = new int[coffee.length];
		int total = 0;
		
		CoffeeBranch(String location) {
			this.location = location;
		}
		
		void order(int coffee, int cnt) {
			sale[coffee] += cnt;
			CoffeeShop.this.sale[coffee] += cnt;
			total += CoffeeShop.this.price[coffee] * cnt;
			CoffeeShop.this.total += CoffeeShop.this.price[coffee] * cnt;
			ind_sale[coffee] += CoffeeShop.this.price[coffee] * cnt;
			CoffeeShop.this.ind_sale[coffee] += CoffeeShop.this.price[coffee] * cnt;
		}
		
		@Override
		public String toString() {
			String ttt = CoffeeShop.this.name+" "+location+"\n";
			for (int i=0; i<coffee.length; i++) {
				ttt += coffee[i]+"\t"+sale[i]+"\t"+ind_sale[i]+"\n";
			}
			ttt += "총 판매금액\t\t"+total;
			return ttt;
		}
	}
}

public class NestedCoffeeShopMain {

	public static void main(String[] args) {
		CoffeeShop b1 = new CoffeeShop("하삼동", new int [] {2000, 2300, 2700});
		CoffeeShop b2 = new CoffeeShop("상남동", new int [] {2100, 2500, 2200});
		
		CoffeeShop.CoffeeBranch [] bbs = {
				b1.new CoffeeBranch("창원"),
				b1.new CoffeeBranch("진주"),
				b1.new CoffeeBranch("김해"),
				b2.new CoffeeBranch("창원"),
				b2.new CoffeeBranch("부산"),
				b2.new CoffeeBranch("통영")
		};
		
		bbs[0].order(0, 1);
		bbs[0].order(1, 10);
		bbs[1].order(1, 5);
		bbs[2].order(0, 7);
		bbs[2].order(2, 5);
		bbs[3].order(2, 11);
		bbs[4].order(2, 3);
		bbs[4].order(1, 5);
		bbs[5].order(0, 8);
		bbs[5].order(1, 3);
		
		for (CoffeeShop.CoffeeBranch ccc : bbs) {
			System.out.println(ccc);
		}
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
