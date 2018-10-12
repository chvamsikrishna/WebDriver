package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	WebDriver d;
	@BeforeTest
	public void check()
	{
		 d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
	}

	
	@DataProvider(name="pebble")
	public Object[][] moJo()
	{
		Object[][] o = new Object[3][2];
		o[0][0]="qwerty@gmail.com";
		o[0][1]="to123";
		
		o[1][0]="qwer@gmail.com";
		o[1][1]="to123";
		
		o[2][0]="qwerty";
		o[2][1]="to123";
		
		return o;
	}
	
	
  @Test(dataProvider="pebble")
  public void f(String m, String p) 
  {
	  d.findElement(By.id("email")).sendKeys(m);
	  d.findElement(By.id("pass")).sendKeys(p);
	  d.findElement(By.id("loginbutton")).click();
      d.close();
  }
  
}
