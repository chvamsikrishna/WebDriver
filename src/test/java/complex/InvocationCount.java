package complex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	WebDriver driver;

@Test(invocationCount=20)
public void count()
{
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
}

	

}
