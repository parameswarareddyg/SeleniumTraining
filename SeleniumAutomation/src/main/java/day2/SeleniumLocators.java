package day2;

import java.util.Arrays;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumLocators {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Locators
		//		1.id
		//		2.name
		//		3.linktext
		//		4.partial linktext
		//		5.class
		//		6.css
		//		7.xpath
		//		8.tagname
		try {
			WebElement searchField = driver.findElement(By.id("APjFqb"));
			searchField.sendKeys("mukhaddar shaik");
			searchField.sendKeys(Keys.ENTER);
			WebElement  linkedProfile =  driver.findElement(By.xpath("//h3[text()='Mukhaddar Shaik - Test Automation Engineer']"));
			linkedProfile.click();
		}
		catch(NoSuchElementException e)
		{
			e.getMessage();
		}


	}

}

