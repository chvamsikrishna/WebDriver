package Develop.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniuim41 {

	public static void main(String[] args) {
   
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		// driver.findElement(By.partialLinkText("Images")).click();
    List   <WebElement>check=  driver.findElements(By.tagName("a"));
    for (int i=0;i<check.size();i++)
    {
    	System.out.println(check.get(i).getText());
    }
       
		 
	}

}
