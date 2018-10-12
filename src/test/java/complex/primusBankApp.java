package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class primusBankApp {
	WebDriver driver;
	
	@Test
	public void getText() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		WebElement d=driver.findElement(By.xpath("//input[@id='txtuId']"));
		boolean b=d.isEnabled();
		if(b==true)
		{
			d.sendKeys("vamsi");
		}
		else
		{
			d.click();
			d.sendKeys("vamsi1");
		}
	//WebElement d1 =driver.findElement(By.xpath("//*[@id=\"personal\"]"));
	  String s= d.getText();
	  Thread.sleep(5000);
	  System.out.println(s);
	

	}
}
