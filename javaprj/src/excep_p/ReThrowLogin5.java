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

class ReThrowUser {
	String id, pw, name;
	public ReThrowUser(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	boolean checkId(String id) throws Exception {
		if (id.equals(this.id)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean CheckPw(String pw) throws Exception {
		if (pw.equals(this.pw)) {
			System.out.println(name+" 로그인 성공");
			return true;
		}
		else {
			throw new Exception("비밀번호가 일치하지 않습니다.");
		}
	}
}


public class ReThrowLogin5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReThrowUser [] userArr = {
			new ReThrowUser("aa", "1111", "이효리"),
			new ReThrowUser("bb", "2222", "삼효리"),
			new ReThrowUser("cc", "3333", "사효리"),
			new ReThrowUser("dd", "4444", "오효리"),
			new ReThrowUser("ee", "5555", "육효리"),
		};
		
		while(true) {
			System.out.print("ID : ");
			String pid = scanner.nextLine();
			System.out.print("PW : ");
			String pw = scanner.nextLine();
			
			try {
				for (ReThrowUser rtu : userArr) {
					if (rtu.checkId(pid)) {
						if (rtu.CheckPw(pw)) {							
							return;
						}
					}
				}
				
				throw new Exception("존재하지 않는 회원입니다.");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
