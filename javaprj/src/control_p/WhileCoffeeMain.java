package control_p;

import java.util.Scanner;

public class WhileCoffeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		while(true) {
			System.out.println("0. 주문 종료, 1. 아메리카노(2500), 2. 아프리카노(2700), 3. 아시아노(3000)");
			System.out.print("메뉴 : ");
			int coffee = sc.nextInt();
			if (coffee == 0) {
				break;
			}
			else {
				System.out.print("수량 : ");
				int qty = sc.nextInt();
				
				if (coffee == 1) {
					System.out.println("아메리카노 "+qty+"잔");
					total += 2500 * qty;
				}
				else if (coffee == 2) {
					System.out.println("아프리카노 "+qty+"잔");
					total += 2700 * qty;
				}
				else if (coffee == 3) {
					System.out.println("아시아노 "+qty+"잔");
					total += 3000 * qty;
				}
			}
		}
		System.out.println("주문 종료 "+total);
		sc.close();
	}

}
