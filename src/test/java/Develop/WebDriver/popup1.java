package Develop.WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) {
       
		WebDriver n = new ChromeDriver();
		n.get("http://demo.guru99.com/test/delete_customer.php");
		n.findElement(By.name("submit")).click();
		Alert alert = n.switchTo().alert();
		System.out.println(alert.getText());
		/*alert.accept();
		alert.accept();*/
		alert.dismiss();
	}

}
