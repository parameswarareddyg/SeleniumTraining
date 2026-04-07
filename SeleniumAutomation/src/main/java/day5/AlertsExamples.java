package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExamples {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		
		String message = driver.switchTo().alert().getText();
		System.out.println("Alert message is  : "+message);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Output for Alert Box : "+driver.findElement(By.xpath("//div[@id='output']")).getText());
		Thread.sleep(3000);
		
		driver.quit(); 

	}

}
