package Develop.WebDriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies1 {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		Set<Cookie> c =d.manage().getCookies();
		int count=c.size();
		System.out.println(count);
		 
		for(Cookie ck : c)
	
		{
			System.out.println(ck.getName());
			System.out.println(ck.getDomain());
			System.out.println("-------------");
		}
		 
		 
	       

	}

}
