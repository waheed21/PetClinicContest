package com.petclinic.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnerPage {

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[3]/a[1]")
	public WebElement menuFindOwners;
	
	@FindBy(xpath ="//a[contains(@class,'btn btn-default')]")
	public WebElement btnAddOwner;
	
	
	//add owner form locators
	@FindBy(name ="firstName")
	//@FindBy(xpath = "//input[@id='firstName']")
	public WebElement txtFirstName;
	
	@FindBy(id ="lastName")
	public WebElement txtLastName;
	
	@FindBy(id ="address")
	public WebElement txtAddress;
	
	@FindBy(id ="city" )
	public WebElement txtCity;
	
	@FindBy(id ="telephone")
	public WebElement txtTelePhone;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement btnAddOwnerSubmission;
	
	
	//add pet for the owner - locators
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement btnFindOwner;
	
	@FindBy(linkText ="Add New Pet")
	public WebElement btnAddNewPet;
	
	@FindBy(id = "name")
	public WebElement txtPetName;
	
	@FindBy(id = "birthDate")
	public WebElement txtPetBirthDate;
	
	@FindBy(id = "type")
	public WebElement ddPetType;
	
	@FindBy(xpath = "//div[@class='col-sm-offset-2 col-sm-10']/button[@type='submit']")
	public WebElement btnAddPetSubmission;
	
	
	//Owner and Pet information varification locators
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr[1]//td/b")
	public WebElement txtOwnerName;
	
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr[2]/td[1]")
	public WebElement txtOwnerAddress;
	
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr[3]/td[1]")
	public WebElement txtOwnerCity;
	
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr[4]/td[1]")
	public WebElement txtOwnerContact;
	
	//...
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr//td//dl/dd[1]")
	public WebElement txNamePet;
	
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr//td//dl/dd[2]")
	public WebElement txtPetDOB;
	
	@FindBy(xpath = "//table[@class='table table-striped']//tbody//tr//td//dl/dd[3]")
	public WebElement txtPetType;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	public List<WebElement> totalRecodCountInGrid;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	public WebElement txtclickOwnerName;
	
	
	
	
	
}
