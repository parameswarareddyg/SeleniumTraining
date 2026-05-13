package tcsinterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Overloading is a form of polymorphism 
 * where multiple functions is having same name with different parameter list
 * the function is called determined by the type of argument being passed to it.
 */
public class OverloadingExample {

	WebDriver driver;

    // Method 1
    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // Method 2 - overloaded method
    public void enterText(By locator, String text, boolean clearField) {

        if (clearField) {
            driver.findElement(locator).clear();
        }

        driver.findElement(locator).sendKeys(text);
    }

    public void launchBrowser() {

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        // Calling Method 1
        enterText(By.id("user-name"), "standard_user");

        // Calling Method 2
        enterText(By.id("password"), "secret_sauce", true);
        
        driver.quit();
    }
	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		obj.launchBrowser();
	}

}
