package Develop.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinksFacebook {

	public static void main(String[] args) throws MalformedURLException {
     
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement lname=links.get(i);
		    String s= lname.getAttribute("href");
		        check(s);
			     
			
		}
		
		
	}

	public static void check(String s) throws MalformedURLException {
		URL url =new URL(s);
		try {
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setConnectTimeout(5000);
			conn.connect();
			if(conn.getResponseCode()==200)
			{
				System.out.println(s+"  "+conn.getResponseMessage());
			}
			if(conn.getResponseCode()==401)
			{
				System.out.println(s+" "+conn.getResponseMessage()+""+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
                 		
	}

}
