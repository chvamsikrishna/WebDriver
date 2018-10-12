package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Employee {
	
	@Test
	public void employeeObject() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/Account/AdminLogin");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("support@jalatechnologies.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\\\"MenusDashboard\\\"]/li[3]/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")));
		Thread.sleep(2000);
		driver.close();
		
	}

}
