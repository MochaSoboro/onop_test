package control_p;

import java.util.Scanner;

public class WhileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		
		while(true) {
			System.out.print("숫자입력(0 입력시 종료) : ");
			
			int no = sc.nextInt();
			if (no == 0) {
				
				break;
			}
			
			tot += no;
			System.out.println("tot : "+tot);
		}
		
		System.out.println("종료 : " +tot);
		sc.close();
	}

}
