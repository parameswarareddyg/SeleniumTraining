package tcsinterviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement element = driver.findElement(By.id("course"));
		Select select = new Select(element);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("net");
		Thread.sleep(3000);
		select.selectByVisibleText("Python");
		Thread.sleep(3000);
		
		List<WebElement> elements = select.getOptions();
		
		for (WebElement option : elements) {
			System.out.println(option.getText());
		}
		
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		WebElement multiDropdown = driver.findElement(By.id("ide"));
		Select multiSelect = new Select(multiDropdown);
		multiSelect.selectByIndex(0);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		
		
		
		driver.quit();
	}

}
