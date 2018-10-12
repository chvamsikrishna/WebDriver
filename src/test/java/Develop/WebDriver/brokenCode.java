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

public class brokenCode {
	

	public static void main(String[] args) throws IOException {
		
		WebDriver d= new ChromeDriver();
		 d.get("https://www.google.com/");
		List <WebElement> link= d.findElements(By.tagName("a"));
		System.out.println("Total Links are" +link.size());
		for(int i=0;i<link.size();i++)
		{
			WebElement w = link.get(i);
			String url =w.getAttribute("href");
			
			toCheckUrl(url);
			
		}
	}

	public static void toCheckUrl(String lurl) throws IOException 
	
	{
		try {
			URL url = new URL(lurl);
			HttpURLConnection hc=(HttpURLConnection)url.openConnection();
			hc.setConnectTimeout(10000);
			hc.connect();
			if(hc.getResponseCode()==200)
			{
				System.out.println(lurl+" "+ hc.getResponseMessage());
			}
			if(hc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(lurl+" "+ hc.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
			
			} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
