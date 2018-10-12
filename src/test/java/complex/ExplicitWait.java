package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ExplicitWait {

   @Test
   public  void  WaitExternal()
   {
	   WebDriver d = new ChromeDriver();
	   
	   d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	   
	   d.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	   
	   WebDriverWait w = new WebDriverWait(d,15);
	   
	   String wait =  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).getText();
	   
	   
	    if(wait.equals("WebDriver"))
	   {
		   System.out.println("element-Displayed");
		   
	   }
	   else
	   {
		   System.out.println("Element Not Displayed");
	   }
	   
   }
   {
	   
   }
}
