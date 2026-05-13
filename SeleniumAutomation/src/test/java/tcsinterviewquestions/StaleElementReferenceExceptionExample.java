package tcsinterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * StaleElementReferenceException occurs when selenium finds a webelement
 * but later there is no longer attached in the current dom(Document object model).
 * 
 * This usually happens when
 * page refreshes
 * AJAX Updates content dynamically
 * Navigation happens
 * Element get Recreated after action
 */
public class StaleElementReferenceExceptionExample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		try {
			WebElement homepageElement = driver.findElement(By.className("hub-home"));
			driver.navigate().refresh();
			homepageElement.click();
		}
		catch(StaleElementReferenceException e)
		{
			int attempt =0;

			while(attempt<3)
			{
				try {
					WebElement homepageElement = driver.findElement(By.className("hub-home"));
					homepageElement.click();
					Thread.sleep(4000);
					break;
				}
				catch(Exception e1)
				{
					attempt++;
				}
			}
			Thread.sleep(4000);
			driver.quit();
		}

	}
}