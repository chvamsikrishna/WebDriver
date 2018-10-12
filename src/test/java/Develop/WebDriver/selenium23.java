package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium23 {
	WebDriver k;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver k= new ChromeDriver();
		k.get("http://magnus2.jalatechnologies.com/");
		k.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")).click();
		String s= k.findElement(By.xpath("//*[@id=\"txtname\"]")).getAttribute("placeholder");
		System.out.println(s);
     
	}

}
