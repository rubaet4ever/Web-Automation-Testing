package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Main{

	public static void clickMain(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
		
			//Test Scenario ID 01-15
			
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
			Thread.sleep(2000);
			
			//Check whether the user is able to click on the search box or not
			
			driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("Khilgaon");
			Thread.sleep(3000);
			
			//Verify whether the user is able to type in the search box or not
		    //Verify that the typed text is properly visible or not
			
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/ul/li[4]/div/div[2]/p")).click();
		    Thread.sleep(4000);
		    
		    //Check whether the auto-suggestion is working or not
		    //Verify specific keyword search after the correct location on the map showing or not 
		    
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div/button")).click();
		    Thread.sleep(3000); 
		    //Verify whether the user is able to explore nearby food options clickable or not
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div/button[2]")).click();
		    Thread.sleep(3000);
		    //Verify whether the user is able to explore nearby bank options clickable or not
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div/button[3]")).click();
		    Thread.sleep(3000);
		    ////Verify whether the user is able to explore nearby healthcare options clickable or not
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div/a[2]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div[2]/button")).click();
		    Thread.sleep(3000);
		    //Verify whether the user is able to explore nearby education options clickable or not
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[4]/div[2]/div/div[2]/button[2]")).click();
		    Thread.sleep(3000);
		    //Verify whether the user is able to explore nearby hotel options clickable or not
		    
		    
		    driver.findElement(By.cssSelector(".fa-times > path")).click();
		    Thread.sleep(2000);
		    
		    //Check after search user is able to click on the close button or not
		    
		    
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button/span")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button/span")).click();
		    Thread.sleep(2000);
		    
		    //Verify the user is able to zoom in
		    
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button[2]/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button[2]/span")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button[2]/span")).click();
		    Thread.sleep(2000);
		    
		    //Verify the user is able to zoom out
		    
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div/div/button/span")).click();
		    Thread.sleep(3000);
		    
		    //Verify the user is able to fullscreen on the map
		    
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/div/div/div/button/span")).click();
		    Thread.sleep(3000);
		    
		    //Verify the user is able to fullscreen to shrink on the map
		    
		
		    
		    }
		    catch(Exception exp) {
			exp.printStackTrace();
			driver.quit();
		}
}
		
		
	}


