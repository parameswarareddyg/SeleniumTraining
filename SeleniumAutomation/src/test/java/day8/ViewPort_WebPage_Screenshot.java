package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewPort_WebPage_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/viewport.jpg");
		FileUtils.copyFile(src, dest);
		driver.quit();
		
	}

}
