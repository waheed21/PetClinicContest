package com.petclinic.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author
 * Initialize browser
 * Set application URL
 * Different selenium methods
 */
public class BasePage 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static JavascriptExecutor js=null;
	
	
	public static void browserInitConfiguration(){
		
		if(Constants.browser.contains("GoogleChrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\PetClinicContest\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(Constants.browser.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "C:\\PetClinicContest\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		
		 else if(Constants.browser.equals("InternetExplorer")){
		  System.setProperty("webdriver.ie.driver", "C:\\PetClinicContest\\resources\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();		 
		  }
		 		
		
		  else{ System.out.println("Invalid browser"); 
		 }
		 
			
		
		driver.get(Constants.appURL);		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);
		
		
		wait = new WebDriverWait(driver, 15);	
		js = (JavascriptExecutor)driver;
		
	}
	
	
	//Method returns the current page URL
	public static String getCurrentPageURL(){
		return driver.getCurrentUrl();
	}
	
	//Method returns the current page TITLE
	public static String getCurrentPageTitle(){		
		return driver.getTitle();		
	}
	
	
	/*
	 * //Method used to verify two strings public static void verifyEquals(String
	 * actual, String expected) throws IOException { try {
	 * Assert.assertEquals(actual, expected); }
	 * 
	 * catch (Throwable e) {
	 * 
	 * } }
	 */
    
    public static void verifycontains(String actual, String expected){
  //  	assertTrue(actual.contains(expected));
    }
    
    
	//Method click the element on page
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	
	//Method used to input values in text field as 'Sendkey Method'
	public static void type(WebElement element, String value) {
		if(!element.getText().isEmpty())
		{
			element.clear();
		}
		
		element.sendKeys(value);
	}
	
	
	//Method used to select value from drop-down field
	public static void selectElement(WebElement element, String value) {
		Select selectObj = new Select(element);
		selectObj.selectByVisibleText(value);
	}
	
	
	//Method close browser
	public static void quitBrowser(){
		if(driver !=null) {
			driver.quit();
		}
	}
	
	
}
