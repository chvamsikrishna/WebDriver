package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium26 {


	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/radio.html");
	WebElement radio_1=	d.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
	    radio_1.click();
	    boolean radio_1status = radio_1.isSelected();
	    System.out.println(radio_1status);
		

	}

}
