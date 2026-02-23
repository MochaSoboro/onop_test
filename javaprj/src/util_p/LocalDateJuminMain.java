package util_p;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

//주민번호를 이용하여 
//생년월일
//나이
//올해생일

//다가올 생일
//다가올 생일파티(토, 일 인경우 전 금요일)
//생일파티 D-day 를 출력하세요

public class LocalDateJuminMain {

	public static void main(String[] args) {
		String juminNum = "950321-1234567";
		
		// 생년월일
		String syear = juminNum.substring(0, 2);
		int iyear = (syear.charAt(0)-'0')*10 + (syear.charAt(1)-'0');
		if (iyear > 25) {
			iyear += 1900;
		}
		else {
			iyear += 2000;
		}
		
		String sbirth = iyear + juminNum.substring(2, 6);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate birth = LocalDate.parse(sbirth, dtf);
		dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E)");
		System.out.println("생년월일: "+birth.format(dtf));
		
		// 나이
		LocalDate now = LocalDate.now();
		int age = now.getYear() - birth.getYear();
		int month = birth.getMonthValue();
		int day = birth.getDayOfMonth();
		
		LocalDate compareDate = LocalDate.of(now.getYear(), month, day);
		if (now.isBefore(compareDate)) {
			age--;
		}
		System.out.println("나이: "+age);
		
		// 올해 생일
		System.out.println("올해 생일: "+compareDate.format(dtf));
		
		LocalDate nextBirthday = compareDate;
		// 다가올 생일
		if (now.isAfter(compareDate)) {	// 생일이 지났다면
			nextBirthday = LocalDate.of(now.getYear()+1, month, day);
		}
		System.out.println("다가올 생일: "+nextBirthday.format(dtf));
		
		// 다가올 생일파티
		System.out.println(nextBirthday.getDayOfWeek());	// SATURDAY
		System.out.println(nextBirthday.getDayOfWeek().ordinal());	// 5	(월~일, 0~6)
		System.out.println(nextBirthday.getDayOfWeek().getValue());	// 6	(월~일, 1~7)
		if ((nextBirthday.getDayOfWeek()).equals(DayOfWeek.SATURDAY) || (nextBirthday.getDayOfWeek()).equals(DayOfWeek.SUNDAY)) {
			nextBirthday = nextBirthday.minusWeeks(1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		}
		System.out.println("다가올 생일파티: "+nextBirthday.format(dtf));
		
		// D-day
		int cnt = 0;
		while(now.isBefore(nextBirthday)) {
			now = now.plusDays(1);
			cnt++;
		}
		System.out.println("D-day: "+cnt);
	}

}
