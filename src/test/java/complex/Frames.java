package complex;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Frames {
	
	WebDriver driver = new ChromeDriver();
	
	public Frames()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//a[text()='Iframes']")
	WebElement frameClick;
	
	@FindBy(xpath="//*[@id=\"menu_projects\"]/a")
	WebElement frame1;
	
	@FindBy(xpath="//*[@id=\"txtBox\"]")
	WebElement frame2;
	
	
@Test
public void iFrames()
{
	driver.get("http://magnus2.jalatechnologies.com/more.aspx");
	frameClick.click();
	
	driver.switchTo().frame(0);
	frame1.click();
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	frame2.sendKeys("selenium frames");
	driver.switchTo().defaultContent();
	
	List<WebElement> iFrames=driver.findElements(By.xpath("//iframe"));
	int  totalFrames=iFrames.size();
	System.out.println(totalFrames);
	
}

}
