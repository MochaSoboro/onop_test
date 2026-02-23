package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;

//주민번호를 이용하여 
//생년월일
//나이
//올해생일

//다가올 생일
//다가올 생일파티(토, 일 인경우 전 금요일)
//생일파티 D-day 를 출력하세요

public class SimpleDateFormatJuminMain {

	public static void main(String[] args) throws Exception {
		String juminNum = "950321-1234567";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date birth = sdf.parse((((juminNum.charAt(7)-'0'-1)%4/2+19)+juminNum).substring(0,8));
		System.out.println(birth);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("생년월일: "+sdf.format(birth));
		
		sdf = new SimpleDateFormat("yyyy");
		String syear = sdf.format(birth);
		int iyear = (syear.charAt(0)-'0')*1000+(syear.charAt(1)-'0')*100+(syear.charAt(2)-'0')*10+(syear.charAt(3)-'0');
		int age = 2025-iyear;
		System.out.println("나이: "+age);
		
		sdf = new SimpleDateFormat("2025년 MM월 dd일");
		String thisBirth = sdf.format(birth);
		System.out.println("올해 생일: "+thisBirth);
		
	}

}
