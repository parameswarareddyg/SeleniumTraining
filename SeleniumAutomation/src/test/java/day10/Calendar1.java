package day10;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement firstCalendar = driver.findElement(By.id("first_date_picker"));
		js.executeScript("arguments[0].scrollIntoView(true)",firstCalendar);
		firstCalendar.click();
		selectCalendar(driver,"19/Dec/2019");
		driver.quit();

	}
	
	public static void selectCalendar(WebDriver driver,String targetDate) {
		Calendar calendar = Calendar.getInstance();
		int targetDay,targetMonth,targetYear;
		
		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy",Locale.ENGLISH);
			targetDateFormat.setLenient(false);
			Date formatedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formatedTargetDate);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		targetMonth = calendar.get(Calendar.MONTH);
		targetYear = calendar.get(Calendar.YEAR);
		
		System.out.println(targetDay+" , "+targetMonth+" , "+targetYear);
		String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("Current Date : "+currentDate);
		try {
		calendar.setTime(new SimpleDateFormat("MMM yyyy",Locale.ENGLISH).parse(currentDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentYear = calendar.get(Calendar.YEAR);
		
		System.out.println(currentMonth+"  "+currentYear);
		
		while(currentMonth < targetMonth || currentYear < targetYear)
		{
			
			driver.findElement(By.className("ui-datepicker-next")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
//			System.out.println("Current Date : "+currentDate);
			try {
			calendar.setTime(new SimpleDateFormat("MMM yyyy",Locale.ENGLISH).parse(currentDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}
		
		while(currentMonth > targetMonth || currentYear > targetYear)
		{
			
			 driver.findElement(By.className("ui-datepicker-prev")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
//			System.out.println("Current Date : "+currentDate);
			try {
			calendar.setTime(new SimpleDateFormat("MMM yyyy",Locale.ENGLISH).parse(currentDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}
		
		if(currentMonth == targetMonth && currentYear == targetYear) {
			driver.findElement(By.xpath("//td/a[text()='"+targetDay+"']")).click();
		}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
