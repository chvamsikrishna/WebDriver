package Develop.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) {
       
		WebDriver w = new ChromeDriver();
		String i="Demo Guru99 page";
		String j="";
		w.get("http://demo.guru99.com/test/guru99home/");
		w.findElement(By.xpath("//*[@id=\"site-name\"]/a[2]"));
		w.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		j=w.getTitle();
		
		if(j.equals(i))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		w.close();
		
		
	}

}
