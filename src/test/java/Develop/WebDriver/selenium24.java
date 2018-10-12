package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium24 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("India Today");
		try
		{ 
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			

		}
		

	}

}
