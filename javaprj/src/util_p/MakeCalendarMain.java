package util_p;

import java.util.Calendar;

public class MakeCalendarMain {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		calendarShow(today);
		
		today.add(Calendar.MONTH, 1);
		calendarShow(today);
		
		today.add(Calendar.MONTH, 1);
		calendarShow(today);
		
	}
	
	static void calendarShow(Calendar today) {
		String ttt = "\t\t\t"+today.get(Calendar.YEAR)+"년 ";
		ttt += (today.get(Calendar.MONTH)+1)+"월";
		System.out.println(ttt);
		
		String weeks = "\t일\t월\t화\t수\t목\t금\t토";
		System.out.println(weeks);
		String days = "";
		today.set(Calendar.DATE, 1);
		int startDate = today.get(Calendar.DAY_OF_WEEK);
		
		// 이전달의 마지막 날짜
		for (int i=1; i<startDate; i++) {
			days+="\t";
		}
		
		// 이번달
		for (int i=1; i<=today.getActualMaximum(Calendar.DATE); i++) {
			days+="\t"+i;
			today.set(Calendar.DATE, i);
			if (today.get(Calendar.DAY_OF_WEEK) == 7) {
				days += "\n";
			}
		}
		System.out.println(days);
	}

}
