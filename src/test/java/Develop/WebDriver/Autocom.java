package Develop.WebDriver;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Autocom {
	
	WebDriver d;
	Properties p;
	AutoCom1 com;
	
	
@BeforeSuite
public void openFile() throws IOException
{
	p = new Properties();
	FileInputStream fis = new FileInputStream("C:\\repo\\WebDriver\\src\\test\\java"
			+ "\\Develop\\WebDriver\\config.properties");
	
	p.load(fis);
}
@BeforeMethod
public void openBrowser()
{
   d = new ChromeDriver();
   d.get(p.getProperty("url"));
  
}

@Test
public void perform()
{
	 com = new AutoCom1();
	 com.elementActions();
}

@AfterMethod
public void close()
{
	d.close();
}
}
