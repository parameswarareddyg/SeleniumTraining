package day9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPractise1 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.id("fourth_date_picker")).click();	

		selectCalendarValue(driver,"1/Aug/2022");
		Thread.sleep(10000);
		driver.quit();

	}

	protected static void selectCalendarValue(WebDriver driver,String targetDate) throws Exception
	{
		int targetDay,targetMonth,targetYear;
		
		Calendar calendar = Calendar.getInstance();
		try {
			
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			Date formatedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formatedTargetDate);
		}catch(Exception e)
		{
			e.getMessage();
		}
		targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		targetMonth = calendar.get(Calendar.MONTH);
		targetYear = calendar.get(Calendar.YEAR);
		
		System.out.println("Month : "+targetMonth);
		System.out.println("Year : "+targetYear);
		System.out.println("Day : "+targetDay);
		WebElement monthElement = driver.findElement(By.className("ui-datepicker-month"));
		Select selectMonth = new Select(monthElement);
		selectMonth.selectByValue(""+targetMonth+"");
		
		WebElement YearElement = driver.findElement(By.className("ui-datepicker-year"));
		Select selectYear = new Select(YearElement);
		selectYear.selectByValue(""+targetYear+"");
		
		WebElement dateElement = driver.findElement(By.xpath("//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()='"+targetDay+"']"));
		dateElement.click();
		


	}


}
