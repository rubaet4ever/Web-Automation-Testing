package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchButton {

	public static void clickSearchButton(WebDriver driver) {
		// TODO Auto-generated method stub
		
		try {
			
			// Test Scenario ID:22
			
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".fa-search")).click();
			Thread.sleep(3000);
			//Verify without entering anything in the search box click on the search button work or not.
		}
		catch(Exception exp) {
			exp.printStackTrace();
			driver.quit();
		
	}

}
}