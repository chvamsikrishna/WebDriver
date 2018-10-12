package Develop.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCom1 extends Autocom {
	
	public AutoCom1()
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//*[@id=\"myNavbar\"]/ul/li[3]/a")
	WebElement moreClick;
	
	@FindBy(xpath= "//*[@id=\"left-navbar\"]/li[3]/a")
	WebElement autoClick;
	
	@FindBy(xpath="//*[@id=\"more-tab\"]/div/ul/li[1]/a")
	WebElement singleClick;
	
	@FindBy(xpath="//*[@id=\"tags\"]")
	WebElement text;
	
	
	public  void elementActions()
	{
		moreClick.click();
		autoClick.click();
		singleClick.click();
		text.sendKeys(p.getProperty("key"));
	    List<WebElement> options=d.findElements(By.className("ui-menu-item-wrapper"));
	    for(WebElement optionToSelect : options)
	    {
	    	if(optionToSelect.equals(p.getProperty("searchValueKey")))
	    {
	    		optionToSelect.click();
	    		break;
	    }
	}
	
	
	

}
}
