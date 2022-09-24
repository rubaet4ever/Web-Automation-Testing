package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidSearch {

	public static void clickValidSearch(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			//Test Scenario ID 16
			
			  driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input")).sendKeys("East West Dress Pant Limited");
				Thread.sleep(4000);
				//Verify the search functionality by entering the valid searched keyword in the search box.
				driver.findElement(By.xpath("//li/div/div[2]")).click();
				Thread.sleep(4000);
			    driver.findElement(By.cssSelector(".fa-times > path")).click();
			    Thread.sleep(4000);
			
		}
		
	    catch(Exception exp) {
				exp.printStackTrace();
				driver.quit();
			}
		
	}
	
	

}
