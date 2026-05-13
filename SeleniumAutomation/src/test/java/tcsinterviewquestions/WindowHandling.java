package tcsinterviewquestions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String googleTab = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String>  tabs = new ArrayList<String>(windows);
		for (String window : windows) {
			if(window.equals(googleTab))
			{
				driver.switchTo().window(window);
				Thread.sleep(4000);
			}
		}
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);
		driver.quit();

	}

}
