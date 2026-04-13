package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Question:
		 * 
		 * “Which browser supports native full page screenshot in Selenium?”
		 * 
		 * Answer: 
		 * ✅ Firefox (GeckoDriver) 
		 * ❌ Chrome (needs workaround) 
		 * ❌ Edge (same as Chrome)
		 */		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		File src =  driver.getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/fullpage.jpg");
		FileUtils.copyFile(src, dest);
		driver.quit();

	}

}
