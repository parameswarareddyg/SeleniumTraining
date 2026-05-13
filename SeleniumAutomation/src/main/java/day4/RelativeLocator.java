package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) {
//		Relative Locators
//		1)above()
//		2)below()
//		3)toLeftOf()
//		4)toRightOf()
//		5)near()
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.instagram.com/");
		
		WebElement usernameElement = driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].style.border='3px solid red';"+
					     "arguments[0].style.backgroundColor='yellow';", usernameElement);
		
		usernameElement.sendKeys("abc@gmail.com");
		WebElement passwordElement = driver.findElement(with(By.tagName("input")).below(usernameElement));
		js.executeScript("arguments[0].style.border='3px solid red';"+
			     "arguments[0].style.backgroundColor='yellow';", passwordElement);
		passwordElement.sendKeys("1234");
		
		
		WebElement title = driver.findElement(with(By.tagName("span")).above(usernameElement));
		js.executeScript("arguments[0].style.border='3px solid red';"+
			     "arguments[0].style.backgroundColor='yellow';", title);
		WebElement privacyElement = driver.findElement(By.xpath("//span[contains(text(),'Privacy')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", privacyElement);
		js.executeScript("arguments[0].style.border='3px solid red';"+
	     "arguments[0].style.backgroundColor='yellow';", privacyElement);
		
		WebElement APIElement = driver.findElement(with(By.tagName("span")).toLeftOf(privacyElement));


		js.executeScript("arguments[0].style.border='3px solid red';"+
	     "arguments[0].style.backgroundColor='yellow';", APIElement);
		
		WebElement termsElement = driver.findElement(with(By.tagName("span")).toRightOf(privacyElement));


		js.executeScript("arguments[0].style.border='3px solid red';"+
	     "arguments[0].style.backgroundColor='yellow';", termsElement);
		
		WebElement nearElement = driver.findElement(with(By.tagName("span")).near(termsElement));

		js.executeScript("arguments[0].style.border='3px solid red';"+
	     "arguments[0].style.backgroundColor='yellow';", nearElement);
	}

}
