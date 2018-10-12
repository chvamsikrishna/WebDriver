package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {

	@Test
	public void login() throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm="
				+ "false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc="
				+ "1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		d.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("chamakuruvamsi");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("1234");
		
	
		
		
	}
}
