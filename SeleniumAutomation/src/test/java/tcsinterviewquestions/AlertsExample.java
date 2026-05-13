package tcsinterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		WebElement element = driver.findElement(By.id("alertBox"));
		element.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		WebElement element1 = driver.findElement(By.id("confirmBox"));
		element1.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		
		WebElement element2 = driver.findElement(By.id("promptBox"));
		element2.click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Reddy");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		
		driver.quit();

	}

}
