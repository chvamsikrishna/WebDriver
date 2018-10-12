package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newProject {
	  WebDriver driver;

	public static void main(String[] args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://magnus2.jalatechnologies.com/");
		    driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"txtname\"]")).sendKeys("admin");
		    driver.findElement(By.xpath("//*[@id=\"txtpsw\"]")).sendKeys("admin");
		    driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
		
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
