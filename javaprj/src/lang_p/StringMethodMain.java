package lang_p;

import java.util.Arrays;

public class StringMethodMain {

	public static void main(String[] args) {
		String a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a3a4";
		
		System.out.println(a);
		System.out.println(a.length());
		char ch = a.charAt(2);
		System.out.println(ch);
		
		String b = "a2023LSH";
		int yy = 0;
		
		for (int i=1; i<=4; i++) {
			
			yy *= 10;
			int c = b.charAt(i)-'0';
			yy += c;
			System.out.println(c+", "+b.charAt(i)+", "+yy);
		}
		
		String d = a.substring(7);
		System.out.println(d);
		
		d = a.substring(7, 13);	// 7 ~ 12
		System.out.println(d);
		
		int pos = a.indexOf("a");	// a의 위치
		System.out.println(pos);
		pos = a.indexOf("a", 12);	// 12의 위치부터 찾기
		System.out.println(pos);
		
		pos = a.indexOf("a", 12, 22);	// 12 ~ 22 사이에서 검색, 없으면 -1
		System.out.println(pos);
		pos = a.indexOf("k");
		System.out.println(pos);	// -1
		pos = a.indexOf("av");
		System.out.println(pos);	// 21
		pos = a.indexOf("A");		// 대소문자 구분
		System.out.println(pos);	// 23
		
		pos = a.lastIndexOf("a");	// 뒤에서부터 찾는다
		System.out.println(pos);	// 35
		pos = a.lastIndexOf("a", 34);
		System.out.println(pos);	// 33
		
		String fff = "aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt";
		System.out.println(fff.lastIndexOf("."));
		System.out.println(fff.substring(29));
		
		System.out.println(a.contains("fG"));		// true
		System.out.println(a.contains("나는무너"));	// false
		
		System.out.println(a.startsWith("아기"));		// true
		System.out.println(a.startsWith("상어"));		// false
		System.out.println(a.endsWith("3a4"));		// true
		System.out.println(a.endsWith("aBCd"));		// false
		
		a = "농구-축구,배구.탁구,,야구,족구";
		String [] arr = a.split(",");
		for (String tt : arr) {
			System.out.println(tt);
		}
		
		System.out.println("---------------------------");
		for (String tt : a.split(",-")) {	// 안됨
			System.out.println(tt);
		}
		
		System.out.println("---------------------------");
		for (String tt : a.split("[.]")) {
			System.out.println(tt);
		}
		
		System.out.println("---------------------------");
		for (String tt : a.split("[.,-]")) {
			System.out.println(tt);
		}
		
		String [] arr2 = {"달리기", "줄다리기", "줄넘기", "기러기"};
		d = String.join(" 연결 ", arr2);
		System.out.println(d);
		
		a = "아기상어 뚜루루뚜루 aBCd EfG JavA 만세 ja 12a3a4";
		d = a.replace("a", "에이");
		System.out.println(d);
		d = a.replaceAll("a", "에이");
		System.out.println(d);
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		char [] arr5 = a.toCharArray();
		System.out.println(Arrays.toString(arr5));
		
		a = "레고";
		System.out.println(a.repeat(5));
		d = a.concat("놀이");
		System.out.println(d);
		a = "     onop 12기     ";
		System.out.println(a+", "+a.length());
		d = a.trim();
		System.out.println(d+", "+d.length());
		
	}

}
