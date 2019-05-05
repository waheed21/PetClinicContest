package com.petclinic.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	//Page factory / object respositiry
	@FindBy(xpath = "//a[@class='navbar-brand']")
	public WebElement appLogo;
	
	//@FindBy(xpath = "//img[@class='img-responsive']")
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	public WebElement petImage;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[2]/a[1]")
	public WebElement menuHome;
	


}
