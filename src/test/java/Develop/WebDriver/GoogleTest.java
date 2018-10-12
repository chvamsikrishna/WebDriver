package Develop.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver d;

	@BeforeMethod
	public void setUp()
	{
		d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test(priority=2)
	public void TitleTest()
	{
		String s=d.getTitle();
		System.out.println(s);
	}
	@Test(priority=1)
	public void LinkTest()
	{
		boolean link=d.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(link);
		
	}
	@AfterMethod
	public void browser()
	{
		
		d.quit();
		
		
		
		
		
		
		
		
	}
	
	
	
}
