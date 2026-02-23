package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws Exception {
		Date today = new Date();
		System.out.println(today);
		
		String [] ppArr = {
			"y", "yy", "yyyy",			// 년도
			"M", "MM", "MMM", "MMMM",	// 월
			"d", "dd", "DD", "DDD",		// 일
			"w", "ww", "W", "WW",		// 주
			"E", "EE", "EEE", "EEEE",	// 요일
			"F",		// 이번달 몇번째 요일(3번째 금요일)
			"z", "Z",	// 타임존
			
			"a", "H", "HH", "h", "hh",
			"m", "mm",
			"s", "ss",
			"S", "SSS"
		};
		
//		Locale loc = new Locale("en");
		
//		for (String pp : ppArr) {
////			SimpleDateFormat sdf = new SimpleDateFormat(pp, loc);
//			SimpleDateFormat sdf = new SimpleDateFormat(pp, Locale.ENGLISH);
//			
//			System.out.println(pp+" : "+sdf.format(today));
//		}
		String [] formatArr = {
				"''yy年", "MMM", "dd일", "(E)", "HH:mm:ss"
		};
		String ttt = "";
		for (int i=0; i<formatArr.length; i++) {
			
			SimpleDateFormat sdf = new SimpleDateFormat(formatArr[i], Locale.ENGLISH);
			if (i == 3) {
				sdf = new SimpleDateFormat(formatArr[i]);
			}
//			System.out.print(sdf.format(today)+" ");
			ttt += sdf.format(today)+" ";
		}
		System.out.println(ttt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		today = sdf.parse("1988-06-05 15:32:45.23");
		System.out.println(today);
		today = sdf.parse("1988-194-89 98:65:85.153");
		System.out.println(today);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		today = sdf.parse("2020-02-20");
		System.out.println(today);
		
		sdf = new SimpleDateFormat("HH:mm:ss");
		today = sdf.parse("19:23:16");	// 날짜 명시하지 않을 경우 1970-1-1
		System.out.println(today);
	}

}
