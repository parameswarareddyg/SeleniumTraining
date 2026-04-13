package day8;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='right click me']")));
		action.contextClick(button).perform();
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.quit();

	}

}
