package com.barikoi.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyword {

	public static void clickKeyword(WebDriver driver) {
		// TODO Auto-generated method stub
		
	    try {
	    	
	    	// Test Scenario ID:18-20
	    	
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("5689");
		Thread.sleep(4000);
		//Enter only numbers in the search field and click on the auto-suggestion
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/ul/li[3]/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".fa-times > path")).click();
	    Thread.sleep(4000);
	    
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("a");
		Thread.sleep(4000);
		//Enter any one character in the search box and click on the auto-suggestion
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/ul/li/div/div[2]/p")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".fa-times > path")).click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/form/div/input")).sendKeys("r H, g  T. 5 9 6");
		Thread.sleep(4000);
		//Enter alphanumeric characters in the search box and click on the auto-suggestion
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div/ul/li/div/div[2]/p[2]/span[2]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".fa-times > path")).click();
	    Thread.sleep(4000);
	    }
	    catch(Exception exp) {
				exp.printStackTrace();
				driver.quit();
			}
	    
		
	}

}
