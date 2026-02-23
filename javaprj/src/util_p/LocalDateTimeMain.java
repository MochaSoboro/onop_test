package util_p;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		
		// 불변데이터 -> 날짜를 임의로 변경할 수 없음
		LocalDateTime nn = LocalDateTime.now();	// static 메소드
		System.out.println(nn);	// 2025-12-18T14:13:30.113973800
		
		// OS/JVM 의 TimeZone 기준
		nn = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(nn);
		
		System.out.println("TimeZone 변경(ZoneId.of)");
		nn = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(nn);
		nn = LocalDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(nn);
		nn = LocalDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println(nn);
		nn = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(nn);
		nn = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(nn);
		
		System.out.println("of");
		// 월 표시를 일반 상태로 입력
		nn = LocalDateTime.of(2025, 12, 10, 16, 23);	// 년, 월, 일, 시, 분
		System.out.println(nn);	// 2025-12-10T16:23
		nn = LocalDateTime.of(2025, 12, 10, 16, 23, 45);	// 년, 월, 일, 시, 분, 초
		System.out.println(nn);	// 2025-12-10T16:23:45
		nn = LocalDateTime.of(2025, 12, 10, 16, 23, 45, 987);	// 년, 월, 일, 시, 분, 초, 밀리초
		System.out.println(nn);	// 2025-12-10T16:23:45.000000987
		
		// 문자열로 생성(파싱)
		nn = LocalDateTime.parse("2002-06-02T19:43:58.132000987");
		System.out.println(nn);	// 2002-06-02T19:43:58
		
		System.out.println("getXXX()");
		System.out.println(nn.getYear());
		System.out.println(nn.getMonthValue());	// 월을 숫자로
		System.out.println(nn.getMonth());	// 월을 영문자 축약어로
		Month mm = nn.getMonth();	// Month는 enum 형태
		System.out.println(mm);
		DayOfWeek dd = nn.getDayOfWeek();	// enum
		System.out.println(dd);	// 요일 영문자
		System.out.println(nn.getDayOfYear());	// 일년 중 며칠
		
		System.out.println(nn.getHour());
		System.out.println(nn.getMinute());
		System.out.println(nn.getSecond());
		System.out.println(nn.getNano());
		
//		nn.setYear(2005);	불변데이터 - set이 없음
		
		// withXXX() 자신을 바꾸는 것이 아니라 바뀐 날짜데이터를 리턴
		System.out.println("withXXX()");
		LocalDateTime aa = nn.withYear(2005);
		System.out.println(aa);
		System.out.println(nn.withMonth(4));
		System.out.println(nn.withDayOfMonth(17));	// 이번달 중 17번째 날짜
		System.out.println(nn.withDayOfYear(100));	// 올해 중 100번째 날짜
		
		System.out.println(nn.withHour(21));
		System.out.println(nn.withMinute(37));
		System.out.println(nn.withSecond(21));
		System.out.println(nn.withNano(192837465));
		
		aa = nn.withYear(1982)
				.withMonth(7)
				.withDayOfMonth(8)
				.withHour(13)
				.withMinute(15)
				.withSecond(19)
				.withNano(333444555);
		System.out.println(aa);
		
		// ChronoField : enum
		System.out.println("ChronoField");
		System.out.println(nn.with(ChronoField.YEAR, 1988));  // 1988-06-02T19:43:58.132000987
		System.out.println(nn.with(ChronoField.MONTH_OF_YEAR, 9)); 
		System.out.println(nn.with(ChronoField.DAY_OF_MONTH, 13)); 
		System.out.println(nn.with(ChronoField.HOUR_OF_DAY, 16)); 
		System.out.println(nn.with(ChronoField.MINUTE_OF_HOUR, 36)); 
		System.out.println(nn.with(ChronoField.SECOND_OF_MINUTE, 27)); 
		
		System.out.println("TemporalAdjusters");
		System.out.println(nn.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println(nn.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(nn.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));	// 다가오는 수요일
		System.out.println(nn.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));	// 다가오는 금요일
		
		System.out.println("plusXXX()");
		System.out.println(nn);
		System.out.println("year:\t"+nn.plusYears(5));
		System.out.println("month:\t"+nn.plusMonths(5));
		System.out.println("weeks:\t"+nn.plusWeeks(5));
		System.out.println("day:\t"+nn.plusDays(5));
		System.out.println("hour:\t"+nn.plusHours(5));
		System.out.println("minute:\t"+nn.plusMinutes(5));
		System.out.println("second:\t"+nn.plusSeconds(5));
		System.out.println("nano:\t"+nn.plusNanos(5));
		
		System.out.println("minusXXX()");
		System.out.println(nn);
		System.out.println("year:\t"+nn.minusYears(5));
		System.out.println("month:\t"+nn.minusMonths(5));
		System.out.println("weeks:\t"+nn.minusWeeks(5));
		System.out.println("day:\t"+nn.minusDays(5));
		System.out.println("hour:\t"+nn.minusHours(5));
		System.out.println("minute:\t"+nn.minusMinutes(5));
		System.out.println("second:\t"+nn.minusSeconds(5));
		System.out.println("nano:\t"+nn.minusNanos(5));
		
		
		System.out.println("비교");
		LocalDateTime n1 = LocalDateTime.of(2025, 10, 10, 10, 10);
		LocalDateTime n2 = LocalDateTime.of(2025, 11, 11, 11, 11);
		LocalDateTime n3 = LocalDateTime.of(2025, 11, 11, 11, 11);
		LocalDateTime n4 = LocalDateTime.of(2025, 12, 12, 12, 12);
		System.out.println("isAfter");
		System.out.println(n2.isAfter(n1));	// true
		System.out.println(n2.isAfter(n3));	// false
		System.out.println(n2.isAfter(n4));	// false
		System.out.println("isBefore");
		System.out.println(n2.isBefore(n1));	// false
		System.out.println(n2.isBefore(n3));	// false
		System.out.println(n2.isBefore(n4));	// true
		System.out.println("isEqual");
		System.out.println(n2.isEqual(n1));	// false
		System.out.println(n2.isEqual(n3));	// true
		System.out.println(n2.isEqual(n4));	// false
		System.out.println("compareTo");
		System.out.println(n2.compareTo(n1));	// 1 (n2 > n1)
		System.out.println(n2.compareTo(n3));	// 0 (n2 = n3)
		System.out.println(n2.compareTo(n4));	// -1 (n2 < n4)
		
		System.out.println("LocalDate, LocalTime");
		LocalDate ld1 = LocalDate.now();
		LocalTime lt1 = LocalTime.now();
		System.out.println(ld1);	// 2025-12-18 (날짜만 가지고 옴)
		System.out.println(lt1);	// 15:20:35.460445400
		ld1 = LocalDate.of(2013, 10, 22);
		lt1 = LocalTime.of(15, 14, 13, 111222333);
		System.out.println(ld1);	// 2013-10-22
		System.out.println(lt1);	// 15:14:13.111222333
		
		nn = LocalDateTime.of(ld1,  lt1);
		System.out.println(nn);	// 2025-12-18T15:21:39.279266500
		
		nn = LocalDateTime.of(2009, 9, 9, 8, 8, 8, 888777666);
		System.out.println(nn);
		ld1 = nn.toLocalDate();
		lt1 = nn.toLocalTime();
		System.out.println(ld1);
		System.out.println(lt1);
		
		System.out.println("formatter");
		DateTimeFormatter dtf;
		
		nn = LocalDateTime.of(2009, 6, 3, 16, 06, 27, 987456321);
		ZoneId zone = ZoneId.of("Asia/Seoul");
		ZonedDateTime zt = nn.atZone(zone);
		dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		String ttt = nn.format(dtf);
		System.out.println(ttt);
		
		String [] ppArr = {
			"y", "yy", "yyy", "yyyy",
			"u", "uuuu", 	// ISO(국제표준) 연도
			"M", "MM", "MMM", "MMMM",
			"d", "dd",
			"D",  "DD",	// day of year
			"e", "ee",	// 요일 숫자 (1 ~ 7)
			"E", "EE", "EEE", "EEEE",	// 요일 영어로
			"w", "ww",	// 해당 연도의 몇번째 주인지 알 수 있음
			"W",	// 월 단위 주
			"H", "HH",	// 0~23
			"h", "hh", 	// 12시간 기준
			"m", "mm",	// 시간의 분 단위
			"s", "ss",
			"S", "SS", "SSS", "SSSS", "SSSSSSSSS",	// 밀리초, 나노초 (최대 9개)
			"n",	// 나노초
			"a", 	// 오전, 오후
			"z", "Z", "X"	// 타임존
			
		};
		
		for (String pp : ppArr) {
//			dtf = DateTimeFormatter.ofPattern(pp);
//			dtf = DateTimeFormatter.ofPattern(pp, Locale.KOREAN);
			dtf = DateTimeFormatter.ofPattern(pp, Locale.ENGLISH);
			System.out.println(pp+":"+zt.format(dtf));
		}
		
		String asdf = "2015-08-26 10:23:49";
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		nn = LocalDateTime.parse(asdf);
		nn = LocalDateTime.parse(asdf, dtf);
		System.out.println(nn);
	}

}
