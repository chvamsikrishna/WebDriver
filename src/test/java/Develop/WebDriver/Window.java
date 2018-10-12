package Develop.WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
WebDriver driver= new ChromeDriver();

@Test
public void windowSwitch() throws InterruptedException
{
	driver.get("http://magnus2.jalatechnologies.com/win.aspx");
	driver.findElement(By.xpath("//*[@id=\"left-navbar\"]/li[7]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"btn-one\"]")).click();
    String window1= driver.getWindowHandle();
    System.out.println(window1);
   // Thread.sleep(2000);
   // driver.switchTo().window(window1);
    Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"uname\"]")).sendKeys("vamsi");
    driver.close();
   
   
    
}

}
