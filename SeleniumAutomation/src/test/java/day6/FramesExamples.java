package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesExamples {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-extension");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement frame = driver.findElement(By.id("frm2"));
		js.executeScript("arguments[0].scrollIntoView(true)", frame);
		driver.switchTo().frame(frame);
		WebElement firstName = driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView(true)", firstName);
		firstName.sendKeys("Hello World");
		
		
//		js.executeScript(
//			    "document.querySelectorAll('iframe[id^=\"aswift\"], iframe[src*=\"doubleclick\"]').forEach(el => el.remove());"
//			);
//	
		driver.switchTo().defaultContent();
				
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.quit();
		
		
		
	}
}
