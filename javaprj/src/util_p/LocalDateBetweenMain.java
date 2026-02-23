package util_p;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateBetweenMain {

	public static void main(String[] args) {
		LocalDateTime ld1 = LocalDateTime.of(783, 12, 10, 0, 1, 5);
		LocalDateTime ld2 = LocalDateTime.of(2025, 12, 15, 2, 2, 6);
		
		System.out.println("ChronoUnit");
		long cnt = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println("YEARS:\t\t"+ChronoUnit.YEARS.between(ld1, ld2));	// 년
		System.out.println("MILLENNIA:\t"+ChronoUnit.MILLENNIA.between(ld1, ld2));	// 천년
		System.out.println("CENTURIES:\t"+ChronoUnit.CENTURIES.between(ld1, ld2));	// 백년
		System.out.println("DECADES:\t\t"+ChronoUnit.DECADES.between(ld1, ld2));
		System.out.println("MONTHS:\t\t"+ChronoUnit.MONTHS.between(ld1, ld2));
		System.out.println("WEEKS:\t\t"+ChronoUnit.WEEKS.between(ld1, ld2));
		System.out.println("DAYS:\t\t"+ChronoUnit.DAYS.between(ld1, ld2));	// 날짜
		System.out.println("HALF_DAYS:\t"+ChronoUnit.HALF_DAYS.between(ld1, ld2));
		System.out.println("HOURS:\t\t"+ChronoUnit.HOURS.between(ld1, ld2));
		System.out.println("MINUTES:\t\t"+ChronoUnit.MINUTES.between(ld1, ld2));
		System.out.println("SECONDS:\t\t"+ChronoUnit.SECONDS.between(ld1, ld2));
		System.out.println("MILLIS:\t\t"+ChronoUnit.MILLIS.between(ld1, ld2));
		System.out.println("MICROS:\t\t"+ChronoUnit.MICROS.between(ld1, ld2));
		ld1 = LocalDateTime.of(2003, 12, 10, 0, 1, 5);
		System.out.println("NANOS:\t\t"+ChronoUnit.NANOS.between(ld1, ld2));
		
		System.out.println("Period");
		LocalDate ld3 = LocalDate.of(2003, 9, 15);
		LocalDate ld4 = LocalDate.of(2025, 12, 20);
		Period pp = Period.between(ld3, ld4);
		System.out.println(pp);
		
		System.out.println("Years:\t"+pp.getYears());
		System.out.println("Months:\t"+pp.getMonths());
		System.out.println("Days:\t"+pp.getDays());
		
		System.out.println("Duration");
		ZoneId zone = ZoneId.of("Asia/Seoul");
		ld1 = LocalDateTime.of(2025, 12, 10, 0, 1, 5, 111_222_333);
		ld2 = LocalDateTime.of(2025, 12, 15, 2, 2, 6, 334_456_789);
		ZonedDateTime zd1 = ld1.atZone(zone);
		ZonedDateTime zd2 = ld2.atZone(zone);
		
		Duration dd = Duration.between(zd1, zd2);
		
		System.out.println("Seconds:\t"+dd.getSeconds());
		System.out.println("Nano:\t"+dd.getNano());
		System.out.println("Millis:\t"+dd.toMillis());
		
		System.out.println("TimeStamp");
		Instant inst1 = zd1.toInstant();
		Instant inst2 = zd2.toInstant();
		
		System.out.println("inst1:\t"+inst1);
		System.out.println("초단위:\t"+inst1.getEpochSecond());
		System.out.println("밀리초단위:\t"+inst1.toEpochMilli());
		System.out.println("inst2:\t"+inst2);
		System.out.println("초단위:\t"+inst2.getEpochSecond());
		System.out.println("밀리초단위:\t"+inst2.toEpochMilli());
		
	}

}
