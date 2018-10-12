package complex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElements {
	
	WebDriver d;
	
@Test
public void hidden()
{
	d= new ChromeDriver();
	d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	List<WebElement> icons= d.findElements(By.id("male"));
	int count= icons.size();
	
	for(int i=0;i<count;i++)
	{
		
		int x = icons.get(i).getLocation().getX();
		if(x!=0)
		{
			icons.get(i).click();
		}
		
	}
	
}
	
	

}
