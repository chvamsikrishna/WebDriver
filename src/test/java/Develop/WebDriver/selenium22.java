package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium22 {
	WebDriver w;
	

	public static void main(String[] args) {
		try {
	
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   WebDriver w = new ChromeDriver();
		   w.get("http://magnus2.jalatechnologies.com/");
		   w.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")).click();
		   w.findElement(By.xpath("//*[@id=\"txtname\"]")).sendKeys("admin");	
		   w.findElement(By.xpath("//*[@id=\"txtpsw\"]")).sendKeys("admin");
		 
		   
		   w.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
		   
		  
		   
		  
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
		   

	}

}
