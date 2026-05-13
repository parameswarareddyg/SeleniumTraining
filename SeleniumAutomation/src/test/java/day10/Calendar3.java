package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("fifth_date_picker")).click();
		int targetDay = 14;
		driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"+targetDay+"']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
