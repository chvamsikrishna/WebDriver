package Develop.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	WebDriver driver;
	
@Test
public void capture() throws IOException
{
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File f = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("./screenShot/google.png"));
	
}
  

}
