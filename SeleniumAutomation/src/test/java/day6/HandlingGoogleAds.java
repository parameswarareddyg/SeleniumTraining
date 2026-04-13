package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGoogleAds {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement frame1 = driver.findElement(By.id("frm2"));
		js.executeScript("arguments[0].scrollIntoView(true)", frame1);
		driver.switchTo().frame(frame1);
		WebElement firstName = driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView(true)", firstName);
		firstName.sendKeys("Hello World");
		
		
		
		List<WebElement>  frames = driver.findElements(By.tagName("iframe"));
		
		for(WebElement frame : frames) 
		{
			try {
					driver.switchTo().frame(frame);
					WebElement closeBtn = driver.findElement(
			            By.xpath("//div[contains(@class,'close-button')]")
			        );

			        closeBtn.click();
			        System.out.println("Ad closed inside iframe");
			        driver.switchTo().defaultContent();
			        break;
				
			}catch(Exception e) {
				driver.switchTo().defaultContent();
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}
}
