package com.petclinic.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.petclinic.base.BasePage;
import com.petclinic.locators.HomePage;

public class HomePageActions extends BasePage{
	
	HomePage homePageObj;
	
	
	//current class constructor
	public HomePageActions() {
		this.homePageObj = new HomePage();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.homePageObj);		
	}
	
	
	
	//Actions:	
	public boolean validatePetImage(){
		
		return homePageObj.petImage.isDisplayed();
	}
	

}
