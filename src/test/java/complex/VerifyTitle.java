package complex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
	Properties prop;
	
@BeforeTest
public void test() throws IOException
{
	
	driver = new ChromeDriver();
	prop= new Properties();
	FileInputStream f = new FileInputStream("C:\\repo\\WebDriver\\src\\test\\java\\Develop\\WebDriver\\config.properties");
	prop.load(f);
	
}

@Test
public void titleCheckWithAssertEquals()
{
	driver.get(prop.getProperty("url1"));
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	 String ActualMessage =driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/"
	 		+ "div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getText();
	 String ExpectedMessage = "Enter an email or phone number";
	 
	 Assert.assertEquals(ActualMessage, ExpectedMessage);
	 System.out.println("passed");
	 
}
@Test
public void titleCheckWithAssertTrue()
{
	driver.get(prop.getProperty("url1"));
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	 String ActualMessage =driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/"
	 		+ "div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
	 
	 
	 Assert.assertTrue(ActualMessage.contains("email or phone"));
	
}

}
