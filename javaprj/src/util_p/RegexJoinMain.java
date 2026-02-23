package util_p;

/*
RegexJoinMain
/ 회원 가입 유효성 검사를 실시하세요
1. 아이디 : 영문 숫자 조합(4자이상)
2. 비번 , 비번확인(5자이상, 대소문자,특수문자조합 ) 
3. 이메일  -  아이디:영문,숫자(3글자이상)   @  도메인 : 영문 점
4. 이름 (한글만 가능) 2~5자
5. 주민번호 
6. 사진 첨부-->영문,숫자(3글자 이상).이미지 확장자
이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음

7. 우편번호 검색 - 구단위 (초성검색)
예외처리로 처리할 것

 * */

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexJoinMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw, pwck, email, name, juminNum, imageName;
		
		// 아이디 입력
		while(true) {
			System.out.print("아이디 입력:");
			id = sc.nextLine();
			
			if (Pattern.matches(".*[a-zA-Z].*", id) && Pattern.matches(".*[0-9].*", id) && Pattern.matches(".{4,}", id)) {
				System.out.println("올바른 아이디");
				break;
			}
			else {
				System.out.println("잘못된 아이디");
			}
		}
		
		// 비밀번호 입력
		while(true) {
			System.out.print("비밀번호 입력:");
			pw = sc.nextLine();
			
			// 5자 이상, 대소문자, 특수문자
			if (Pattern.matches(".{5,}", pw) && Pattern.matches(".*[a-z].*", pw) && Pattern.matches(".*[A-Z].*", pw) && Pattern.matches(".*[!@#$%].*", pw)) {
				System.out.println("올바른 비밀번호");
				break;
			}
			else {
				System.out.println("wrong pw");
			}
		}
		
		// 비밀번호 확인
		while(true) {
			System.out.print("비밀번호 확인:");
			pwck = sc.nextLine();
			if (pwck.equals(pw)) {
				System.out.println("비밀번호 일치");
				break;
			}
			else {
				System.out.println("비밀번호 불일치");
			}
		}
		
		// 이메일 확인
		while(true) {
			System.out.print("이메일 입력:");
			email = sc.nextLine();
			String ck = email.split("@")[0];
			String domain = email.split("@")[1];
			// 영문, 숫자, 3글자 이상, 도메인(영문, 점)
			if (Pattern.matches(".{3,}", ck) && Pattern.matches(".*[a-zA-Z].*", ck) && Pattern.matches(".*[0-9].*", ck) && Pattern.matches("[a-zA-Z.]+", domain)) {
				System.out.println("올바른 이메일 입력");
				break;
			}
			else {
				System.out.println("이메일 다시 입력");
			}
		}
		
		// 이름 확인
		while(true) {
			System.out.print("이름 입력:");
			name = sc.nextLine();
			
			if (Pattern.matches(".{2,5}", name) && Pattern.matches("[가-힣]+", name)) {
				System.out.println("올바른 이름");
				break;
			}
			else {
				System.out.println("잘못된 이름");
			}
		}
		
		// 주민번호 6-7
		while(true) {
			System.out.print("주민번호 입력:");
			juminNum = sc.nextLine();
			if (Pattern.matches("\\d{6}-\\d{7}", juminNum)) {
				System.out.println("주민번호 입력 완료");
				break;
			}
			else {
				System.out.println("잘못된 주민번호");
			}
		}
		
		// 사진 첨부
		while(true) {
			System.out.print("사진 이름:");
			imageName = sc.nextLine();
			String img = imageName.substring(0, imageName.lastIndexOf("."));
			System.out.println(img);
			if (Pattern.matches(".{3,}", img) && Pattern.matches("[a-zA-Z0-9]+", img) && Pattern.matches(".*(jpg|jpeg|bmp|png|gif)", imageName.toLowerCase())) {
				System.out.println("사진 첨부 확인");
				break;
			}
			else {
				System.out.println("잘못된 사진 이름");
			}
		}
	}

}
