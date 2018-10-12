package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium25 {
	public static void main(String[] args)
	{
		WebDriver d =new ChromeDriver();
		d.get("https://www.instagram.com/?hl=en");
		boolean e= d.findElement(By.xpath("//*[@id=\"f31a34adb214904\"]")).isEnabled();
		System.out.println(e);
		if(e==true)
		{
			System.out.println("yes it is");
		}
		System.out.println("no");
		
		
		
	}

}


