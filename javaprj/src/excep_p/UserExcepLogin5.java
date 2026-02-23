package excep_p;

import java.util.Scanner;

/*
ThrowLogin5
5명의 정보로 로그인을 구현하세요

로그인 성공시 이름으로 출력하세요

aa, 1111, 이효리
bb, 2222, 삼효리
cc, 3333, 사효리
dd, 4444, 오효리
ee, 5555, 육효리
 * */

class UserExcepCla {
	String id, pw, name;
	public UserExcepCla(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	

}

class LoginUserExcep extends Exception {
	String [] uArr = {
			"비밀번호가 일치하지 않습니다.",
			"존재하지 않는 회원입니다."
	};
	
	String msg;
	
	LoginUserExcep(int num) {
		msg = uArr[num];
	}
	
	public String getMessage() {
		return msg;
	}
}

public class UserExcepLogin5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserExcepCla [] userArr = {
			new UserExcepCla("aa", "1111", "이효리"),
			new UserExcepCla("bb", "2222", "삼효리"),
			new UserExcepCla("cc", "3333", "사효리"),
			new UserExcepCla("dd", "4444", "오효리"),
			new UserExcepCla("ee", "5555", "육효리"),
		};
		
		while(true) {
			System.out.print("ID : ");
			String pid = scanner.nextLine();
			System.out.print("PW : ");
			String pw = scanner.nextLine();
			
			try {
				for (UserExcepCla tu : userArr) {
					if (pid.equals(tu.id)) {
						if (pw.equals(tu.pw)) {
							System.out.println(tu.name+" 로그인");
							return;
						}
						else {
							throw new LoginUserExcep(0);
						}
					}
				}
				
				throw new LoginUserExcep(1);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
