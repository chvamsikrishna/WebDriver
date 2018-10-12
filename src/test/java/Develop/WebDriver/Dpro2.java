package Develop.WebDriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Dpro2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/AddUser.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	  
	   
   }
	
	
 
 @Test(dataProvider = "test1")
 public void Test(String Name, String Mobile,String mail,String Country,String Comments)
 {
	 WebElement name = driver.findElement(By.xpath("//*[@id=\"txtName\"]"));
	 name.sendKeys(Name);
	  
	 WebElement mobile= driver.findElement(By.xpath("//*[@id=\"txtmobileno\"]"));
	 mobile.sendKeys(Mobile);
	  
	  WebElement Email = driver.findElement(By.xpath("//*[@id=\"txtemail\"]"));
	   Email.sendKeys(mail);
	  
	  WebElement country = driver.findElement(By.xpath("//*[@id=\"txtcountry\"]"));
	   country.sendKeys(Country);
	   
	   WebElement comments = driver.findElement(By.xpath("//*[@id=\"txtcomments\"]"));
	   comments.sendKeys(Comments);
	   
	  WebElement add= driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
	   add.click();


	   
}
 
 @DataProvider(name = "test1")
 public Object[][] testData()
 {
	 Object[][] testCase = new Object[2][5];
	 
	 testCase[0][0]="vamsi";
	 testCase[0][1]="8886174746";
	 testCase[0][2]="vamsi@gmail.com";
	 testCase[0][3]="india";
	 testCase[0][4]="just do it";
	 
	 
	 testCase[1][0]="sai";
	 testCase[1][1]="8886174746";
	 testCase[1][2]="sai@gmail.com";
	 testCase[1][3]="india";
	 testCase[1][4]="just do it";
	 
	 return testCase;
	 
 }

}
