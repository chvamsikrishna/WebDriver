package Develop.WebDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NoKeys {

	WebDriver d = new ChromeDriver();

	@Test
	public void setUp()
	{
		d.get("https://www.abhibus.com/");
		d.manage().window().maximize();
		
	
	
		 WebElement a = d.findElement(By.xpath("//*[@id=\"source\"]"));
		 
		 JavascriptExecutor js =(JavascriptExecutor)d;
		 
		 
		 js.executeAsyncScript("arguments[0].value='tirupathi'", a);
	}
	
	
}
