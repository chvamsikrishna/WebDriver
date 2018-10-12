package complex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoComplete {
	
WebDriver d;
@BeforeTest
public void setUpCompleteText()
{
	d= new ChromeDriver();
	d.get("http://magnus2.jalatechnologies.com/more.aspx");
	WebElement auto=d.findElement(By.xpath("//a[text()='Auto Complete']"));
	auto.click();
}
@Test
public void completeTest() throws InterruptedException
{
	d.findElement(By.xpath("//a[@href='#a']")).click();
	d.findElement(By.xpath("//*[@id=\"tags\"]")).sendKeys("j");
	Thread.sleep(5000);
	List<WebElement> elements=d.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
	

	for(WebElement object: elements)
	{
		System.out.println("object is " +object.getText());
   
		String s= object.getText(); 
	
		if(s.equalsIgnoreCase("Java"))
		{
			object.click();
			break;
		}
		else
		{
			System.out.println("No element found");
		}
	}
	
}

}
