package Develop.WebDriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium51 {

	public static void main(String[] args) {
     
		WebDriver d =new ChromeDriver();
		d.get("https://www.google.com/");
		//d.findElement( By.xpath("*//input[starts-with(@id,'lst-')]")).sendKeys("selenium");
	  d.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
	  d.findElement( By.xpath("*//input[starts-with(@id,'lst')]")).sendKeys("cool");
	  
	  
		
		
	}

}
