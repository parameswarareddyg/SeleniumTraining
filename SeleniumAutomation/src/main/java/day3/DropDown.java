package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;


public class DropDown {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement singleDropDown = driver.findElement(By.id("course"));
		
		Select select = new Select(singleDropDown);
		
		
		System.out.println("Selected Option is : "+select.getFirstSelectedOption().getText());
		
		select.selectByValue("net");
		
		System.out.println("Selected Option is : "+select.getFirstSelectedOption().getText());
//		select.selectByVisibleText("Javascript");
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		WebElement doubleDropDown = driver.findElement(By.id("ide"));
		Select select1 = new Select(doubleDropDown);
		
//		select1.selectByIndex(1);
//		select1.selectByIndex(3);
		List<WebElement> multiDropDownElements=select1.getOptions();
		
		for (WebElement val : multiDropDownElements) {
				select1.selectByVisibleText(val.getText());
		}
		
		driver.quit();
		
	}

}
