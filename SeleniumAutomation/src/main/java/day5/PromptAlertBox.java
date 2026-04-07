package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//accept code
		driver.findElement(By.id("promptBox")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Box Text : "+alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Mukhaddar Shaik");
		Thread.sleep(3000);
		System.out.println("Alert Box Text : "+alert.getText());
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement outputElement = driver.findElement(By.xpath("//div[@id='output']"));
		js.executeScript("arguments[0].scrollIntoView(true)", outputElement);
		System.out.println("Output for Alert Box : "+outputElement.getText());
		Thread.sleep(3000);
		
		//dismiss code
		driver.findElement(By.id("promptBox")).click();
		
		System.out.println("Alert Box Text : "+alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Mukhaddar Shaik");
		Thread.sleep(9000);
		alert.dismiss();
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", outputElement);
		System.out.println("Output for Alert Box : "+outputElement.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
