package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		if(driver.findElement(By.className("b3wTlE")).isDisplayed()) {
			driver.findElement(By.className("b3wTlE")).click();
		}
		WebElement loginbutton = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action = new Actions(driver);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		action.moveToElement(loginbutton).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Sign Up']")));
		driver.findElement(By.xpath("//a[@title='Sign Up']")).click();
		Thread.sleep(6000);
		driver.quit();

	}

}
