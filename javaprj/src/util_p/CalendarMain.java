package util_p;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
//		Calendar qwer = new Calendar();
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.get(0));	// 1
		System.out.println(today.get(1));	// 2025
		System.out.println(today.get(Calendar.YEAR));	// 2025
		System.out.println(today.get(Calendar.MONTH)+1);	// 12, 0부터 시작
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));	// 요일, 일요일 & 1부터 시작
		
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));	// 올해의 몇번째 주
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));	// 이번달 몇번째 주
		
		System.out.println(today.get(Calendar.AM_PM));	// 오전 0, 오후 1
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		System.out.println(today.getTimeZone().getID());	// Asia/Seoul
		
		System.out.println("-----------------------------");
		
		// 출력 방식 1984 년 3 월 20일 (수요일) 13:34:56.789
		cdToStr(today);
		
		System.out.println(today.getTimeInMillis());
		System.out.println(today.getTimeInMillis()/1000/60/60/24/365 + 1970);	// 2026
		System.out.println(today.getActualMaximum(Calendar.YEAR));	// Calendar로 볼 수 있는 최대 연도
		System.out.println(today.getActualMaximum(Calendar.MONTH));	// Calendar로 볼 수 있는 최대 month, 11
		System.out.println(today.getActualMaximum(Calendar.DATE));	// Calendar로 볼 수 있는 최대 날짜
		System.out.println(today.getActualMaximum(Calendar.HOUR_OF_DAY));	// Calendar로 볼 수 있는 최대 시간, 23
		
		System.out.println("set >>>>>>>>>>>>>");
		today.set(1997, 3-1, 20);
		cdToStr(today);	// 1997년 3월 20일 (금요일) 12:17:44.241
		today.set(1997, 3-1, 20, 16, 23);
		cdToStr(today); // 1997년 3월 20일 (금요일) 16:23:44.241
		today.set(1997, 3-1, 20, 16, 23, 45);
		cdToStr(today); // 1997년 3월 20일 (금요일) 16:23:45.241
		today.set(Calendar.YEAR, 2002);
		cdToStr(today); // 2002년 3월 20일 (목요일) 16:23:45.241
		today.set(2000, 68-1, -200, 1234, -8765, 11223344);
		cdToStr(today);	// 2005년 7월 6일 (목요일) 5:30:44.526
		today.setTimeInMillis(0);
		cdToStr(today);	// 1970년 1월 1일 (금요일) 9:0:0.0
		
		System.out.println("add >>>>>>>>>>>");
		today = Calendar.getInstance();
		cdToStr(today);	// 2025년 12월 18일 (금요일) 12:23:50.937
		
		today.add(Calendar.MONTH, 3);
		cdToStr(today); // 2026년 3월 18일 (목요일) 12:23:50.937
		today.add(Calendar.MONTH, -7);
		cdToStr(today); // 2025년 8월 18일 (화요일) 12:23:50.937
		
		System.out.println("after before");
		Calendar now = Calendar.getInstance();
		cdToStr(now);	// 2025년 12월 18일 (금요일) 12:25:16.749
		System.out.println(now.after(today));	// true (now > today)
		System.out.println(now.before(today));	// false (now < today)
		
		System.out.println("Date util");
		
		Date dd;
		dd = today.getTime();
		System.out.println(dd); // Mon Aug 18 12:27:45 KST 2025
		
		dd = new Date();
		System.out.println(dd); // Thu Dec 18 12:28:04 KST 2025
		today.setTime(dd);
		cdToStr(today);	// 2025년 12월 18일 (금요일) 12:28:23.492
		
	}
	
	static void cdToStr(Calendar today) {
		int year, month, day, week, hour, minute, second, millisecond;
		String [] weeks = {"일", "월", "화", "수", "목", "금", "토"};
		
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH)+1;
		day = today.get(Calendar.DATE);
		week = today.get(Calendar.DAY_OF_WEEK);
		hour = today.get(Calendar.HOUR_OF_DAY);
		minute = today.get(Calendar.MINUTE);
		second = today.get(Calendar.SECOND);
		millisecond = today.get(Calendar.MILLISECOND);
		
		String ttt = year+"년 "+month+"월 "+day+"일 ("+weeks[week]+"요일) "+hour+":"+minute+":"+second+"."+millisecond;
		System.out.println(ttt);
		
		
	}

}
