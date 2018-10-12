package Develop.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCount {

	public static void main(String[] args) {
      WebDriver d =new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      d.get("https://in.investing.com/indices/sensex-historical-data");
      d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     int row= d.findElements(By.xpath("//*[@id=\"curr_table\"]/tbody/tr")).size();
     int column= d.findElements(By.xpath("//*[@id=\"curr_table\"]/tbody/tr[1]/td")).size();

     System.out.println(row);
     System.out.println(column);
      
      
      
      
	}

}
