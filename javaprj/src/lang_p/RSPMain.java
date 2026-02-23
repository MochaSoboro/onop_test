package lang_p;

import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] meth = {"가위", "바위", "보"};
		System.out.println("가위 바위 보");
		while(true) {
			System.out.print("0 종료, 1 가위, 2 바위, 3 보 : ");
			int no = sc.nextInt();
			
			if (no == 0) {
				break;
			}
			else if (no > 3) {
				System.out.println("다시 입력");
				continue;
			}
			int hand = (int)(Math.random()*3);
			
			if (hand == (no-1)) {
				System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
				System.out.println("비김");
			}
			else {
				if (hand == 0) {	// 가위
					if (no == 2) {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("승리");
					}
					else {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("패배");
					}
				}
				else if (hand == 1) {	// 바위
					if (no == 3) {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("승리");
					}
					else {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("패배");
					}
					
				}
				else if (hand == 2) {	// 보
					if (no == 1) {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("승리");
					}
					else {
						System.out.println("시스템: "+meth[hand]+", 유저: "+meth[no-1]);
						System.out.println("패배");
					}
					
				}
			}
			
		}
		
		System.out.println("게임 종료");
	}

}
