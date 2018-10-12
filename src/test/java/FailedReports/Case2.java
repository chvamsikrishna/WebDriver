package FailedReports;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Case2 {
	
	@Test
	public void testTwo()
	{
		Assert.assertTrue(true);
		System.out.println("failed case");
	}

}
