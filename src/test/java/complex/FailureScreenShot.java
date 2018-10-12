package complex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailureScreenShot {
	
	WebDriver driver;

@BeforeMethod
public void setUp()
{
	driver= new ChromeDriver();
	driver.get("http://magnus2.jalatechnologies.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
@Test
public void failureTest()
{
	driver.findElement(By.xpath("//a[text()='magnus']"));
}

@AfterMethod
public void tearDown(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
	
	TakesScreenshot magnusFailCases = (TakesScreenshot)driver;
	File f  = magnusFailCases.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(f, new File("./magnusScreenShots/magnusFail.png"));
	}
}

@AfterTest
public void driverClose()
{
	driver.close();
}
}