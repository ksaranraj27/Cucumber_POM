package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//input[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement CRMLogo;
	
	
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
		
	}

	public boolean validateCRMimage() {
		return CRMLogo.isDisplayed();
	}
	
	public HomePage login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", loginBtn);
		
		return new HomePage();
		
		
	}
	
	
	
	
}














