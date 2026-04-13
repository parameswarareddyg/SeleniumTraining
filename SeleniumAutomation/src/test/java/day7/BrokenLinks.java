package day7;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(10000);
		if(driver.findElement(By.className("b3wTlE")).isDisplayed()) {
			driver.findElement(By.className("b3wTlE")).click();
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			String linkUrl = link.getAttribute("href");
			
			   if(linkUrl == null || linkUrl.isEmpty()) {
			        System.out.println("Empty src - Skipped");
			        continue;
			    }

			    if(linkUrl.startsWith("data")) {
			        System.out.println("Base64 Image - Skipped");
			        continue;
			    }
			
			URL url = new URL(linkUrl);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
			
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode() == 200) {
				System.out.println(linkUrl + " > " + httpURLConnection.getResponseMessage()+" > OK ");
			}
			else
			{
				System.err.println(linkUrl+" > "+httpURLConnection.getResponseMessage()+" > Not OK");
			}
		}
		
		driver.quit();

	}

}
