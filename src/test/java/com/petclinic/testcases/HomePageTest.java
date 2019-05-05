
package com.petclinic.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

//import org.junit.Test;
//import org.junit.runners.MethodSorters;
import com.petclinic.actions.HomePageActions;
import com.petclinic.base.BasePage;

/**
 * @author 
 * Home page test cases
 *
 */

public class HomePageTest extends BasePageTest {
	
	HomePageActions homePageActionsObj;
	
	@Test(priority = 1)
	public void validateHomePageTitle(){
		homePageActionsObj = new HomePageActions();
		
		System.out.println();
		
		String PageTitle = BasePage.getCurrentPageTitle();
		System.out.println("PetClinic application home page title: " + PageTitle);
		assertEquals(PageTitle, "PetClinic :: a Spring Framework demonstration");
		System.out.println("PetClinic home page title is verified ");
		System.out.println();
		
		
		String homePageURL = BasePage.getCurrentPageURL();
		System.out.println("PetClinic home page url: " + homePageURL);
		System.out.println();
	}
	
	@Test(priority=2)
	public void validatePetImageTest(){		
		homePageActionsObj = new HomePageActions();
		
		System.out.println();
		Boolean flag = homePageActionsObj.validatePetImage();
		assertTrue(flag);
		
		System.out.println("PetClinic image is validated successfully ");
		System.out.println();
	}
	
	


}
