package complex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class MouseHover {
WebDriver driver=new ChromeDriver();

public MouseHover()
{
	
	PageFactory.initElements(driver, this);

}
 	 
@FindBy(xpath="//*[@id=\"left-navbar\"]/li[2]/a")
WebElement menu;
@FindBy(xpath="//*[@id=\"UpdatePanel1\"]/ul/li[1]/a")
WebElement singleMenu;

@FindBy(xpath="//*[@id=\"b2\"]")
WebElement jClick;

@FindBy(xpath="//a[text()='Sub Menus']")
WebElement subClick;

@FindBy(xpath="//a[@class='dropbtn'][text()='Database']")
WebElement databaseClick;

@FindBy(xpath="//*[@id=\"mysqlbtn\"]")
WebElement sqlClick;

@Test
public void hoverTest() throws InterruptedException
{ 
	   
	    
	    driver.get("http://magnus2.jalatechnologies.com/more.aspx");
	    Thread.sleep(5000);
	    menu.click();
		singleMenu.click();
	   	jClick.click();
	
		Thread.sleep(5000);
		subClick.click();
		
		Actions a = new Actions(driver);
		Thread.sleep(5000);
	a.moveToElement(databaseClick).perform();
	a.moveToElement(sqlClick).click().perform();
		
	}
}


