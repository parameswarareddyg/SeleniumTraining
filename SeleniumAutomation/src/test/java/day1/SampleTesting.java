package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTesting {

	public static void main(String[] args) throws InterruptedException {
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.get("https://www.youtube.com/");
//		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(12000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();//only current tab will close
//		driver.quit(); //close whole browser
	}

}
