package complex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot1 {
  
  WebDriver driver;
  
@Test
public void  MagnusUsersScreenShot() throws IOException
{
	driver = new ChromeDriver();
	driver.get("http://magnus2.jalatechnologies.com/UserPage.aspx");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File f = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("./magnusScreenShots/users.png"));
	
	
}
  
}
