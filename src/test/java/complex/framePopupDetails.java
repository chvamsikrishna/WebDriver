package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framePopupDetails {
	
@Test
public void popupWindow()
{
	WebDriver d = new ChromeDriver();
	d.get("https://www.goibibo.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//a[text()='Sign up']")).click();
	d.switchTo().frame("authiframe");
	d.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("123456789");
	
}
	

}
