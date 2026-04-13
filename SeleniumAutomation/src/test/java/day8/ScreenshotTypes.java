package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.primitives.Bytes;

public class ScreenshotTypes {

	public static void main(String[] args) throws Exception {
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
//		File src=driver.getScreenshotAs(OutputType.FILE);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/fileFormat.jpg");
		FileUtils.copyFile(src, dest);
		
//		byte [] src1 = driver.getScreenshotAs(OutputType.BYTES);
		byte [] src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = new FileOutputStream(new File("./Screenshots/byteFormat.jpg"));
		fos.write(src1);
		fos.close();
		
//		String base = driver.getScreenshotAs(OutputType.BASE64);
		String base = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		byte [] src2 = Base64.getDecoder().decode(base);
		FileOutputStream fos1 = new FileOutputStream(new File("./Screenshots/baseFormat.jpg"));
		fos1.write(src2);
		fos1.close();
		
		
		driver.quit();

	}

}
