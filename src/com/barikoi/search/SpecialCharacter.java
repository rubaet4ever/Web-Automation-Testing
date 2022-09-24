package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialCharacter {

	public static void clickSpecialCharacter(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			
			// Test Scenario ID:21
			
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("@#!_*-&()");
			Thread.sleep(4000);
			//Enter only special characters in the search field and click on the auto-suggestion
		}
		catch(Exception exp) {
			exp.printStackTrace();
			driver.quit();
		
	}
		
	}

}
