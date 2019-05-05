/**
 * 
 */
package com.petclinic.actions;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import com.petclinic.base.BasePage;
import com.petclinic.locators.OwnerPage;

/**
 * @author 
 *
 */
public class OwnerPageActions extends BasePage{
	
	
	OwnerPage ownerPageObj;
	
	//Current class constructor
	public OwnerPageActions() {
		this.ownerPageObj = new OwnerPage();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.ownerPageObj);		
	}
	
	
	//Actions:	
	public void redirectFindOwnerPage(){
		BasePage.clickElement(ownerPageObj.menuFindOwners);
		BasePage.clickElement(ownerPageObj.btnAddOwner);
		
		/*
		 * //It will wait untill respective element get loaded properly new
		 * WebDriverWait(driver, 180).until(new ExpectedCondition<Boolean>() { public
		 * Boolean apply(WebDriver driver) { return (Boolean)
		 * BasePage.js.executeScript("return document.readyState").equals("complete"); }
		 * });
		 */
		
	}
	
	
	public void addNewOwner(String fName, String lName, String adrs, String city, String telphone) throws Exception{			
		  type(ownerPageObj.txtFirstName, fName); 
		  type(ownerPageObj.txtLastName, lName); 
		  type(ownerPageObj.txtAddress, adrs); 
		  type(ownerPageObj.txtCity, city); 
		  type(ownerPageObj.txtTelePhone, telphone);
		  BasePage.clickElement(ownerPageObj.btnAddOwnerSubmission);	
		  
		  clickElement(ownerPageObj.btnAddNewPet);
		}
	
	
	public void addOwnerPet(String name, String birthdate, String pettype) {
		type(ownerPageObj.txtPetName, name);
		type(ownerPageObj.txtPetBirthDate, birthdate);
		
		selectElement(ownerPageObj.ddPetType, pettype);
		
		clickElement(ownerPageObj.btnAddPetSubmission);		
	}
	
	
	public void searchOwnerPet(String ownerLastName) throws Exception
	{
		clickElement(ownerPageObj.menuFindOwners);
		type(ownerPageObj.txtLastName, ownerLastName);
		clickElement(ownerPageObj.btnFindOwner);
		
		Thread.sleep(3000);
		
		if(ownerPageObj.totalRecodCountInGrid.size() > 0) {
			clickElement(ownerPageObj.txtclickOwnerName);
		}
		
	}
	
	
	public Hashtable<String, String>  verificationOwnerPet() {

	       Hashtable<String,String> ReturnValues = new Hashtable<String,String>();
	        
	       String ownerName    = ownerPageObj.txtOwnerName.getText();
	       String ownerAddress = ownerPageObj.txtOwnerAddress.getText();
	       String ownerCity    = ownerPageObj.txtOwnerCity.getText();
	       String ownerContact = ownerPageObj.txtOwnerContact.getText();
			
	       String petName = ownerPageObj.txNamePet.getText();
		   String petDOB =  ownerPageObj.txtPetDOB.getText();
		   String petType = ownerPageObj.txtPetType.getText();        
	              

	       ReturnValues.put("ownerName", ownerName);
	       ReturnValues.put("ownerAddress", ownerAddress);
	       ReturnValues.put("ownerCity", ownerCity);	        
	       ReturnValues.put("ownerContact", ownerContact);	        
	       ReturnValues.put("petName", petName);	        
	       ReturnValues.put("petDOB", petDOB);	        
	       ReturnValues.put("petType", petType);   

	        return ReturnValues;
	    }
	
	
	

}
