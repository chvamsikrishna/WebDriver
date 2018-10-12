package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium31 {

	public static void main(String[] args) {
       WebDriver d = new ChromeDriver();
       d.get("https://www.facebook.com/");
     WebElement w =  d.findElement(By.xpath("//*[@id=\"month\"]"));
           try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
        Select select =new Select(w);
        
        select.selectByVisibleText("Jul");
        
	}

}
