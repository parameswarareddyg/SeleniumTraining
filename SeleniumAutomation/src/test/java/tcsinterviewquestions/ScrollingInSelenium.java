package tcsinterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kpit.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//window.scrollBy(x,y) it will scroll n number of times if we call again and again 
		//upto page end by add position with current position
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(4000);
		
		//window.scrollTo(x,y) scrolls only one time from starting position to the mentioned position of the page.
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h4[text()='Mobility']")));
		Thread.sleep(4000);
		driver.quit();
		
	}

}
