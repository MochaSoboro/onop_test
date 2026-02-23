package basic_p;

enum ECM {
	
	ZAZANG("자장면", 7000), ZZAMBBONG("짬뽕", 8000), TANGSOO6("탕수육", 15000);
	
	final String name;
	final int price;
	private int cnt;
	
	private ECM(String name, int price) {
		this.name = name;
		this.price = price;
		cnt = 0;
	}
	
	public void addCnt() {
		cnt++;
		System.out.println(name+"("+price+") 주문이요");
	}
	public String addCnt2() {
		cnt++;
		return (name+"("+price+") ");
	}
	
	public int getToT() {
		return price*cnt;
	}
	public int getCnt() {
		return cnt;
	}
	
	@Override
	public String toString() {
		return name+"\t"+price+"\t"+cnt+"\t"+getToT();
	}
	
}

public class EnumChinaMain {
	
	String name;
	
	

	EnumChinaMain(String name) {
		this.name = name;
		order("ZAZANG");
		order("ZAZANG,ZZAMBBONG");
		order("ZZAMBBONG");
		order("ZAZANG");
		order("TANGSOO6");
		order("ZZAMBBONG,TANGSOO6");
		order("ZZAMBBONG,ZZAMBBONG,ZZAMBBONG");
		order("ZAZANG");
		order("TANGSOO6");
		
		System.out.println("-------------");
		int tot = 0;
		int cnt = 0;
		for (ECM ecm : ECM.values()) {
			System.out.println(ecm);
			tot += ecm.getToT();
			cnt += ecm.getCnt();
		}
		System.out.println("-------------");
		System.out.println("결과\t\t"+cnt+"\t"+tot);
	}
	
//	void order(String menu) {
//		ECM.valueOf(menu).addCnt();
//	}
	void order(String menus) {
		String ttt = "";
		int tot = 0;
		for (String menu : menus.split(",")) {
			
			ttt += ECM.valueOf(menu).addCnt2();
			tot += ECM.valueOf(menu).price;
		}
		ttt += " : "+tot;
		System.out.println(ttt);
	}



	public static void main(String[] args) {
		new EnumChinaMain("보신각");
	}

}
