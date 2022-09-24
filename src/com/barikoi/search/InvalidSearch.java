package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidSearch {

	public static void clickInvalidSearch(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			
			// Test Scenario ID:17
			
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("a_sdasdnln113132@#!");
			Thread.sleep(4000);
			//verify the search functionality by entering the invalid keyword in the search box.
		}
		catch(Exception exp) {
			exp.printStackTrace();
			driver.quit();
		
	}

		
	}

}
