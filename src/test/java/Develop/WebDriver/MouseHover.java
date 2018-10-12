package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
			WebDriver d = new ChromeDriver();
			d.get("http://magnus2.jalatechnologies.com/");
			WebElement ele= d.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a"));
			Actions a = new Actions(d);
			a.moveToElement(ele).click();
		  
			
			
			
			
			

	}

}
