package Develop.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dpro1 {
	
	@Test (dataProvider="test1")
public void data(String name)
{
	System.out.println();
}
	@DataProvider(name = "test1")
	
 public  Object[][] setData()
 {
		return new Object[][]
	{
		{"vamsi"},{"sai"}
		
	};
 
 }
}
