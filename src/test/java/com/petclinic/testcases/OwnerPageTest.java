package com.petclinic.testcases;



import static org.testng.Assert.assertEquals;

import java.util.Hashtable;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;



import com.petclinic.actions.OwnerPageActions;
import com.petclinic.base.BasePage;

/**
 * @author 
 *
 */

public class OwnerPageTest extends BasePageTest{

	OwnerPageActions OwnerPageActionsObj;
	
	
	@Test(priority = 3)
	public void redirectFindOwnerPageTest(){
		OwnerPageActionsObj = new OwnerPageActions();
		
		System.out.println();
		OwnerPageActionsObj.redirectFindOwnerPage();
		
		String findOwnerPageURL = BasePage.getCurrentPageURL();
		System.out.println("Find Owner Page URL: " + findOwnerPageURL);
		assertEquals(findOwnerPageURL, "http://localhost:8080/owners/new");
		
		System.out.println("Find owner page url is verified");
		System.out.println();		
	}
	
	
	@Test(priority = 4)
	public void addNewOwnerTest() throws Exception{
		OwnerPageActionsObj = new OwnerPageActions();		
	
		System.out.println();	
		OwnerPageActionsObj.addNewOwner("Ahmed3", "Daraj3", "BusinessBay101", "Dubai", "054475550");
		String URL = BasePage.getCurrentPageURL();
		System.out.println("Add owner page url" + URL);
		
	}
	
	@Test(priority =5)
	public void addOwnerPetTest(){
		OwnerPageActionsObj.addOwnerPet("Bublu", "2010-05-05", "dog");
		
		System.out.println();	
		String newPetPageURL = BasePage.getCurrentPageURL();
		System.out.println("New ped add url: " + newPetPageURL);
		System.out.println();
	}
	
	
	@Test(priority =6)
	public void searchOwnerPetTest() throws Exception {
		OwnerPageActionsObj.searchOwnerPet("Daraj3");
		
	}
	
	
	@Test(priority =7)	
	public void verificationOwnerPetTest (){
		
		System.out.println();
		
		Hashtable<String, String> OwnerPetData = OwnerPageActionsObj.verificationOwnerPet();
		
        assertEquals("Ahmed3 Daraj3", OwnerPetData.get("ownerName"));
        assertEquals("BusinessBay101", OwnerPetData.get("ownerAddress"));
        assertEquals("Dubai", OwnerPetData.get("ownerCity"));
        assertEquals("054475550", OwnerPetData.get("ownerContact"));
        
        assertEquals("Bublu", OwnerPetData.get("petName"));
        assertEquals("2010-05-05", OwnerPetData.get("petDOB"));
        assertEquals("dog", OwnerPetData.get("petType"));
        
        System.out.println("Owner and Pet data verified");
        System.out.println();
	}
	
	
	
	
}
