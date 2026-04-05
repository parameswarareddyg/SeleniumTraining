package day3;

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
		
//		select.selectByValue("net");
//		select.selectByVisibleText("Javascript");
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		WebElement doubleDropDown = driver.findElement(By.id("ide"));
		Select select1 = new Select(doubleDropDown);
		
		select1.selectByIndex(1);
		select1.selectByIndex(3);
		
		assert
		
		
	}

}
