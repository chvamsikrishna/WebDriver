package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class date {
@Test
public void checkMagnusDate()
{
	WebDriver d= new ChromeDriver();
  d.get("http://magnus2.jalatechnologies.com/register.aspx");
  d.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("10121994");
  
}
}
