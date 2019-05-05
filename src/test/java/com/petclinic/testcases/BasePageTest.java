
package com.petclinic.testcases;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.petclinic.base.BasePage;

/**
 * @author 
 * 
 */
public class BasePageTest{
	
	
	@BeforeSuite
	public void setUp() {
		BasePage.browserInitConfiguration();		
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		BasePage.quitBrowser();	
	}

}
