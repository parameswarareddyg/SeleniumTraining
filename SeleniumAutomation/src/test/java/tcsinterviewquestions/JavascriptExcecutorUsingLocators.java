package tcsinterviewquestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcecutorUsingLocators {
	public static JavascriptExecutor js ;
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		js = (JavascriptExecutor)driver;

		//one way using selenium methods
		WebElement firstNameElement =(WebElement) js.executeScript("return document.getElementById('firstName');");
		styleElement(firstNameElement);
		firstNameElement.sendKeys("Parameswara Reddy");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('lName')[0].value='Lokesh';");
		js.executeScript("document.getElementsByName('lName')[0].style.cssText='border:2px solid red;  background-color : yellow;';");
		js.executeScript("document.getElementsByClassName('bcRadioButton')[1].click();");
		js.executeScript("document.getElementsByTagName('input')[4].click()");
		js.executeScript("document.querySelector('#email').value='abc@gmail.com';");
		js.executeScript("document.evaluate(\"//button[@id='registerbtn']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static void styleElement(WebElement element)
	{
		js.executeScript("arguments[0].style.cssText='border:2px solid red; background-color:yellow;';", element);
		
	}
	

}
