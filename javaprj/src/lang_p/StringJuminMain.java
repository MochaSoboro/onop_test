package lang_p;
/*
950320-1234567
주민번호를 이용하여
성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이를 출력하세요

1. 1900 년대 내국인 남성
2. 1900 년대 내국인 여성
########################
3. 2000 년대 내국인 남성
4. 2000 년대 내국인 여성
########################
-----------------------------------------------------
5. 1900 년대 외국인 남성
6. 1900 년대 외국인 여성
########################
7. 2000 년대 외국인 남성
8. 2000 년대 외국인 여성
*/	

public class StringJuminMain {

	public static void main(String[] args) {
		String jumin = "950320-1234567";
		String [] gender = {"여성", "남성"};
		String [] nationality = {"내국인", "외국인"};
		
		int g = jumin.charAt(jumin.indexOf("-")+1)-'0';
		System.out.println(gender[g%2]);
		System.out.println(nationality[g/5]);
		int year = 0;
		year = (jumin.charAt(0)-'0') * 10 + jumin.charAt(1)-'0';
		if (year > 25) {
			year += 1900;
		}
		else {
			year += 2000;
		}
		int age = 2025 - year;
		int korage = age;
		int now = 1215;
		int date = (jumin.charAt(2)-'0') * 1000 + (jumin.charAt(3)-'0') * 100 + (jumin.charAt(4)-'0') * 10 + jumin.charAt(5)-'0';
		if (date < now) {
			korage--;
		}
		System.out.println(jumin.substring(0, 2)+"년 "+jumin.substring(2, 4)+"월 "+jumin.substring(4, 6)+"일");
		System.out.println("한국나이 : "+age);
		System.out.println("만나이 : "+korage);
	}

}
