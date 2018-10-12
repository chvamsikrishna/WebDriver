package Develop.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScreenShot {

	WebDriver d;

@Test
public void capture1() throws IOException
{
	
	d= new ChromeDriver();
	d.get("http://magnus2.jalatechnologies.com/");
	d.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("vamsi");
	TakesScreenshot s =(TakesScreenshot)d;
	File file =s.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("./magnusScreenShots/magnus.png"));

}
		
		

	

}
