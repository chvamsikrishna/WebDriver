package Develop.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium32 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
List<WebElement> v = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]"))).getOptions();
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i).getText());
		}
	     String s= v.get(3).getText();
	     System.out.println(".................");
	     System.out.println(s);

	}

}
