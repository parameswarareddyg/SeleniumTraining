package day12;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.*;

public class DateTimeFormatterExample {
	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now(); 
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
		System.out.println(currentDate.format(dateTimeFormat));
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getYear());
		System.out.println(currentDate.getHour());
		System.out.println(currentDate.getMinute());
		System.out.println(currentDate.getSecond());
		
		String inputDate = "21-Apr-2023 11:12:23 AM";
		DateTimeFormatter inputformatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a",Locale.ENGLISH);
		LocalDateTime FormatedDate = LocalDateTime.parse(inputDate,inputformatter);
		DateTimeFormatter outputformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(FormatedDate.format(outputformatter));
	}
}
