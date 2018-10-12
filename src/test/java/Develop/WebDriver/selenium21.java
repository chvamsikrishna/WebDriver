package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium21 {
	WebDriver d;

	public static void main(String[] args) {
		
		try {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://magnus2.jalatechnologies.com/");
		d.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("vamsi");
		d.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("1234");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		

	}

}
