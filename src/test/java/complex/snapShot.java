package complex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class snapShot {

WebDriver driver;

@Test
public void setUp() throws IOException
{
	driver = new ChromeDriver();
	driver.get("http://magnus2.jalatechnologies.com/register.aspx");
	driver.manage().deleteAllCookies();
	this.takeSnapShot(driver,"./screenShot/users.png");
			

}

public void takeSnapShot(WebDriver dr, String string) throws IOException 
{
	TakesScreenshot shot = (TakesScreenshot)dr;
	File f = shot.getScreenshotAs(OutputType.FILE);
	File fs = new File(string);
	FileUtils.copyFile(f, fs);
	
	
	
	
	
}



}
