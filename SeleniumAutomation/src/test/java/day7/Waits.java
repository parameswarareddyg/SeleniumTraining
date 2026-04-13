package day7;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit Wait - all elements
		WebElement firstNameElement = driver.findElement(By.id("firstName"));
		
		firstNameElement.sendKeys(Keys.CONTROL+"A");
		firstNameElement.sendKeys(Keys.BACK_SPACE);
		firstNameElement.sendKeys("Reena");
		
		WebElement lastNameElement = driver.findElement(By.name("lName"));
		//Explicit Wait - particular Element
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lName")));
		lastNameElement.sendKeys("Kumari");
		
		WebElement genderRButoon = driver.findElement(By.id("femalerb"));
		genderRButoon.click();
		
		WebElement englishCheckBox = driver.findElement(By.id("englishchbx"));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofSeconds(1))
					.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("lName")));
		englishCheckBox.click();
		
		WebElement spanishCheckBox = driver.findElement(By.id("spanishchbx"));
		spanishCheckBox.click();
		
		WebElement latinCheckBox = driver.findElement(By.id("latinchbx"));
		latinCheckBox.click();
		
		WebElement frenchCheckBox = driver.findElement(By.id("frenchchbx"));
		frenchCheckBox.click();
		Thread.sleep(3000);
		latinCheckBox.click();
		
		WebElement emailElement = driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
		js.executeScript("arguments[0].scrollIntoView(true)", emailElement);
		emailElement.sendKeys("reena@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("psw"));
		js.executeScript("arguments[0].scrollIntoView(true)", passwordElement);
		passwordElement.sendKeys("reena@12345");
		
		
		WebElement registerButton = driver.findElement(By.id("registerbtn"));
		js.executeScript("arguments[0].scrollIntoView(true)", registerButton);
		registerButton.click();
		
//		WebElement homePageElement = driver.findElement(By.linkText("Click here to navigate to the home page"));
		WebElement homePageElement = driver.findElement(By.partialLinkText("Click here to navigate"));
		js.executeScript("arguments[0].scrollIntoView(true)", homePageElement);
		homePageElement.click();
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
