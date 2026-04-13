package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'grid-formation grid-column-6')])[1]"));
		File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/element.jpg");
		FileUtils.copyFile(src, dest);
		driver.quit();
		

	}

}
