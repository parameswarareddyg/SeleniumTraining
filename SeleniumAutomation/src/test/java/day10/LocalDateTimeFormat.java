package day10;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormat {

	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm:ss");
		String formattedDate = currentDate.format(dateTimeFormatter);
		System.out.println(formattedDate);
		
		System.out.println("Date  : "+currentDate.getDayOfMonth());
		System.out.println("Month : "+currentDate.getMonthValue());
		System.out.println("Year  : "+currentDate.getYear());
		
		
		String targetDate = "21/08/1997";
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(targetDate, dateFormatter);
		
		System.out.println(date.format(dateFormatter));
		
		System.out.println("Date  : "+date.getDayOfMonth());
		System.out.println("Month : "+date.getMonthValue());
		System.out.println("Year  : "+date.getYear());
		
		

	}

}
