package date_examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/** Purpose: Encapsulates date test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class DateTest {
	private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

		public static void main(String[] args) {
		Date today = new Date();

		System.out.println("Today     :: " + today(today));
		System.out.println("Next date :: " + findNextDay(today));
		System.out.println("Prev date :: " + findPrevDay(today));

		LocalDate todayDate = LocalDate.now();

		System.out.println("Today     :: " + todayDate);
		System.out.println("Next date :: " + findNextDay(todayDate));
		System.out.println("Prev date :: " + findPrevDay(todayDate));

		LocalDate date = todayDate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of month = " + date);
		date = todayDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday date = " + date);
	}

	/** Purpose: Performs the today operation. */
	private static Date today(Date today) {
		return today;
	}

	/** Purpose: Retrieves find next day data. */
	private static Date findNextDay(Date date) {
		return new Date(date.getTime() + MILLIS_IN_A_DAY);
	}

	/** Purpose: Retrieves find prev day data. */
	private static Date findPrevDay(Date date) {
		return new Date(date.getTime() - MILLIS_IN_A_DAY);
	}

	/** Purpose: Retrieves find next day data. */
	private static LocalDate findNextDay(LocalDate localdate) {
		return localdate.plusDays(1);
	}

	/** Purpose: Retrieves find prev day data. */
	private static LocalDate findPrevDay(LocalDate localdate) {
		return localdate.minusDays(1);
	}
}
