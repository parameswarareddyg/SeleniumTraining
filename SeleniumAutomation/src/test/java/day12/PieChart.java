package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PieChart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/other/chart_presentation.html");
		Actions action = new Actions(driver);
		List<WebElement> slices = driver.findElements(By.cssSelector(".highcharts-series path.highcharts-point"));
		System.out.println("Size of Slices : "+slices.size());
		for (WebElement slice : slices) {
			action.moveToElement(slice).perform();
			System.out.println(slice.getAttribute("aria-label"));
			
		}
		List<WebElement> toolTipelement = driver.findElements(By.cssSelector(".highcharts-text-outline"));
		for (WebElement toolTip : toolTipelement) {
			System.out.println(toolTip.getText());
			
		}
		driver.quit();
	}
}
