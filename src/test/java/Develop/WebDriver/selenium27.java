package Develop.WebDriver;


import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium27 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/\r\n");
	  List<WebElement> elements =  (d.findElements(By.xpath("//input[@type='radio']")));
	    System.out.println(elements.size());
	    
	    for(int i=0;i< elements.size();i++)
	    {
	    	System.out.println(elements.get(i).getText());
	    }
	     
		
		

		
		
	}

}
