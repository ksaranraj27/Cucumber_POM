package com.qa.stepDefinition;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	
	@Given("^user open browser$")
	public void user_open_browser()  {
	    
		TestBase.intialization();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
		loginpage = new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	    
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		
	homepage=	loginpage.login(properties.getProperty("username"), properties.getProperty("password"));	    
	    
	}


	@Then("^validate homepage title$")
	public void validate_homepage_title()  {
    String title=homepage.verifyHomePageTitle();
		
		Assert.assertEquals("CRMPRO", title);
	    
	    
	}

}
