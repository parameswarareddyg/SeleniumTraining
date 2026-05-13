package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BarChart {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/other/chart_presentation.html");
		driver.findElement(By.className("navigate-right")).click();
		Thread.sleep(3000);
		List<WebElement> elements =driver.findElements(By.cssSelector("#chartcontainer2 .highcharts-point"));
		System.out.println("Bar Charts Size : "+elements.size());
		
		for (WebElement bar : elements) {
		    String aria = bar.getAttribute("aria-label");
		    System.out.println(aria);
		}
		driver.quit();
	}
}
