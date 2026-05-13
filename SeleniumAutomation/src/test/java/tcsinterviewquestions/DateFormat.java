package tcsinterviewquestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		String formattedDate = date.format(formatter);
		
		System.out.println("Formatted Date is : "+formattedDate);
	}

}
