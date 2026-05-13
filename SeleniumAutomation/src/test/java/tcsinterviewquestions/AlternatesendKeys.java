package tcsinterviewquestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class UsingJavascript{
	public void javaScriptMethod() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='standard_user';", driver.findElement(By.id("user-name")));
		Thread.sleep(4000);
		driver.quit();
	}
}

class UsingExplicitWaits
{
	public void waitMethods() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		username.sendKeys("standard_user");
		
		Thread.sleep(4000);
		driver.quit();
	}
}

class UsingActions
{

	public void mouseMovements() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("user-name"))).sendKeys("standard_user").perform();
		Thread.sleep(4000);
		driver.quit();
	}
}
public class AlternatesendKeys {

	public static void main(String[] args) throws Exception{

		UsingJavascript ujs = new UsingJavascript();
		ujs.javaScriptMethod();
		
		UsingExplicitWaits uew = new UsingExplicitWaits();
		uew.waitMethods();
		
		UsingActions ua = new UsingActions();
		ua.mouseMovements();
	}

}
