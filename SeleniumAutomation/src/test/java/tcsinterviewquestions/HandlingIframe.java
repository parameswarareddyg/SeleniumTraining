package tcsinterviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingIframe {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement listElement =driver.findElement(By.id("course"));
		Select select = new Select(listElement);
		select.selectByVisibleText("Java");
		Thread.sleep(3000);
		select.selectByValue("python");
		Thread.sleep(3000);
		select.selectByIndex(0);
		
		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> elements = select.getOptions();
		driver.switchTo().defaultContent();
		driver.findElement(By.className("hub-home")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
