package day5;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		String hyrTab = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		String youtubeTab = driver.getWindowHandle();
		
		
		driver.switchTo().window(hyrTab);
		
		Thread.sleep(5000);
		driver.switchTo().window(youtubeTab);
		Thread.sleep(5000);
		Set<String> windows =driver.getWindowHandles();
		
		for (String window : windows) {
			if(window.equals(hyrTab)) {
				driver.switchTo().window(window);
				Thread.sleep(5000);
			}
			
		}
		
		driver.quit();

	}

}
