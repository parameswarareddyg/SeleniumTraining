package tcsinterviewquestions;

import org.openqa.selenium.edge.EdgeDriver;

//method overriding is a form of polymorphism where child class can have its own implementation that is already implemented in 
//the parent class,where child class can have same methodname,parameterlist and return type as same as the parent class.
public class OverridingExample extends BrowserBase
{

	@Override
	public void launchBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Launching browser from Child Class");
	}
	public static void main(String[] args) {
		OverridingExample obj = new OverridingExample();
		obj.launchBrowser();
	}

}
