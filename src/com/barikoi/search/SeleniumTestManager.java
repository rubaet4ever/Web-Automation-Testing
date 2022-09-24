package com.barikoi.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

    public class SeleniumTestManager {
    	
	public static void main(String[] args) 
	throws InterruptedException{
		
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
			
	final String SERVER_URL = "https://www.barikoi.com/search";
	
	 
	WebDriver driver = getChromeDriver(SERVER_URL); 
	
	// WebDriver webDriverManager;
	// webDriverManager = WebDriverManager.chromedriver();
	// webDriverManager.config().setCachePath("F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32");
     
    
    //  webDriverManager.setup();
	
	//WebDriver driver = getFirefoxDriver(SERVER_URL); 
	
	Main.clickMain(driver);
	//Keyword.clickKeyword(driver);
	//SearchButton.clickSearchButton(driver);
	//ValidSearch.clickValidSearch(driver);
	//InvalidSearch.clickInvalidSearch(driver);
	//SpecialCharacter.clickSpecialCharacter(driver);

	}

	

	private static WebDriver getChromeDriver(String serverUrl) {
	
			final String DRIVER_NAME = "webdriver.chrome.driver";
			final String DRIVER_URL =  "F:\\My Work\\Work Tools\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
			
			System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(serverUrl);
	
		return driver;
	}
	
    private static WebDriver getFirefoxDriver(String serverUrl) {
	
			final String DRIVER_NAME = "webdriver.gecko.driver";
			final String DRIVER_URL = "F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\geckodriver.exe";
			
			System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);
		
		return driver;
	}
	
}

    