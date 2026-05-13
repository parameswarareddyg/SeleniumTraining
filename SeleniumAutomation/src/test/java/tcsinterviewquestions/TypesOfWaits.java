package tcsinterviewquestions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesOfWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait - 
		/*
		 * Repeatedly checks condition
		 * Polls every 500 milliseconds 
		 * Stops immediately once condition passes 
		 * Throws TimeoutException after max time
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hub-home")));
		
		//fluentWait
		FluentWait<WebDriver> waits = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(5))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class);
		
		//Page Load Timeout -
		/*
		 * If page not loaded within 60 seconds:
		 * 
		 * Selenium throws timeout exception
		 */
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		//Script Timeout
		/*
		 * Used for JavaScript execution. 
		 * Mostly used with:
		 * JavaScriptExecutor 
		 * Async scripts
		 */
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		

	}

}
