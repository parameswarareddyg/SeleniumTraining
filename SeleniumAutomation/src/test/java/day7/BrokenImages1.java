package day7;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages1 {

	public static void main(String[] args)  throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/broken-images");
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		for(WebElement img : images) {
			String imgUrl = img.getAttribute("src");
			
			URL url = new URL(imgUrl);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpUrlConnection  = (HttpURLConnection)urlConnection;
			
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() == 200)
			{
				System.out.println(imgUrl + " > "+httpUrlConnection.getResponseMessage()+" > OK ");
			}
			else {
				System.err.println(imgUrl + " > "+httpUrlConnection.getResponseMessage()+" > Not OK ");
			}
		}
		driver.quit();
	}

}
