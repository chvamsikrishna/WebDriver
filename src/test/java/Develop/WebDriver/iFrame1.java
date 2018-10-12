package Develop.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 {
  
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.get("file:///C:/Users/Niranjan%20Sai/Documents/test1.html\r\n");
		int p= d.findElements(By.tagName("iframe")).size();
		System.out.println("no. of frames:" +p);
		
		
	   /* d.switchTo().frame(0);
		d.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/form/input[1]")).click();
		*/
		 for(int i=0;i<p;i++)
		 {
			 d.switchTo().frame(i);
			 if(d.findElements(By.className("headermobile")).size()!=0)
		 d.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/form/input[1]")).click();
			d.switchTo().defaultContent();	 
		 }
				
		

	}

}
