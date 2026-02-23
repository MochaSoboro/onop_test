package excep_p;

import java.util.Scanner;

public class ThrowLoginMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				
				System.out.print("ID : ");
				String pid = sc.nextLine();
				
				if (!pid.equals("aaa")) {
					throw new Exception("id 에러");
				}
				
				System.out.print("PW : ");
				String pw = sc.nextLine();
				
				if(!pw.equals("1234")) {
					throw new Exception("pw 에러");
				}
				
				System.out.println(pid+" 로그인 성공");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("종료--------------");
	}

}
